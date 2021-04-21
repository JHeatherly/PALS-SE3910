import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Account {
    private String username;
    private String password;

    Account() {
        username = "";
        password = "";
    }
    // Generic Constructor.

    Account(String uname, String pword) {
        username = uname;
        password = pword;
    }
    // Constructor with values.

    public String getUname() {
        return username;
    }

    public String getPword() {
        return password;
    }
    // The two get methods are to make sure it worked.
}

public class Login {
    private String role;

    public Login() {
        boolean goodUname = false;
        boolean goodPword = false;
        String test = "";
        String use = "";
        String pass = "";

        ArrayList<String> uname = new ArrayList<>();
        ArrayList<String> pword = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        HashMap<String, String> accounts = new HashMap<String, String>();
        // I figured the login info could alternatively be stored in a hash table...

        // uname.add("pizza");
        // This was so I could test trying to add a duplicate username.

        System.out.print("Please choose a username: ");

        while (!goodUname || !goodPword) {
            test = input.nextLine();

            if (!goodUname) {
                if (uname.contains(test)) {
                    System.out.print("\nThat username is taken.  Please try a different username: ");
                    continue;
                }
                if (!test.matches("(\\d|\\w|\\_){4,15}")) {
                    // This checks against a regular expression. It checks to make sure the user
                    // name is between 4 and 15 alphanumeric characters, including underscores.
                    System.out.print("\nUsername invalid.  Please try a different username: ");
                    continue;
                }
                if (test.matches("(\\d|\\w|\\_){4,15}") && !uname.contains(test)) {
                    System.out.print("\nPlease select a password: ");
                    uname.add(test);
                    use = test;
                    goodUname = true;
                    continue;
                }
            }
            // The above is for picking a username.

            if (!goodPword) {
                if (!test.matches(".{4,10}")) {
                    // This checks to make sure the password is between 4 and 10 characters.
                    // I figured no character restrictions, to make it more secure.
                    System.out.print("\nPassword invalid.  Please try a different password: ");
                    continue;
                }
                if (test.matches(".{4,10}") && !uname.contains(test)) {
                    System.out.println("\nPlease enter your role. (Engineer or Manager)");
                    pword.add(test);
                    pass = test;
                    goodPword = true;
                }
            }
            role = input.nextLine();
        }
        // This section has the user choose a password.

        accounts.put(use, pass);
        // This puts the account into the hash table.

        Account person = new Account(use, pass);
        // This creates the account object.
        System.out.println("Congratulations on setting up your account!");
        System.out.println("Account info:\nUsername: " + person.getUname() + "\nPassword: " + person.getPword());
        // This let me know that the account object was created properly.
    }

    public String getRole() {
        return role;
    }
}