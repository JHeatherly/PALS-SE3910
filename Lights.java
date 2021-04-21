import java.util.Random;

public class Lights {
    static String[][] floor1 = new String[8][2];
    static String[][] floor2 = new String[8][2];
    static String[][] floor3 = new String[8][2];
    static String[][] floor4 = new String[8][2];
    static String[] colors = { "green", "red", "blue", "magenta", "orange" };

    public Lights() {
        setLights();
        // drawLights(1);
    }

    public static void setLights() {
        Random rand = new Random();

        for (int r = 0; r < floor1.length; r++) {
            for (int c = 0; c < floor1[r].length; c++) {
                floor1[r][c] = colors[rand.nextInt(50) / 10];
            }
        }

        for (int r = 0; r < floor2.length; r++) {
            for (int c = 0; c < floor2[r].length; c++) {
                floor2[r][c] = colors[rand.nextInt(50) / 10];
            }
        }

        for (int r = 0; r < floor3.length; r++) {
            for (int c = 0; c < floor3[r].length; c++) {
                floor3[r][c] = colors[rand.nextInt(50) / 10];
            }
        }

        for (int r = 0; r < floor4.length; r++) {
            for (int c = 0; c < floor4[r].length; c++) {
                floor4[r][c] = colors[rand.nextInt(50) / 10];
            }
        }

    }

    public static void drawLights(int floor) {

    }

    public static int getFloor1Count() {
        int count = 0;
        for (int i = 0; i < floor1.length; i++) {
            for (int j = 0; j < floor1[i].length; j++) {
                if (floor1[i][j].equalsIgnoreCase("Red")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int getFloor2Count() {
        int count = 0;
        for (int i = 0; i < floor2.length; i++) {
            for (int j = 0; j < floor2[i].length; j++) {
                if (floor2[i][j].equalsIgnoreCase("Red")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int getFloor3Count() {
        int count = 0;
        for (int i = 0; i < floor3.length; i++) {
            for (int j = 0; j < floor3[i].length; j++) {
                if (floor3[i][j].equalsIgnoreCase("Red")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int getFloor4Count() {
        int count = 0;
        for (int i = 0; i < floor4.length; i++) {
            for (int j = 0; j < floor4[i].length; j++) {
                if (floor4[i][j].equalsIgnoreCase("Red")) {
                    count++;
                }
            }
        }
        return count;
    }
}