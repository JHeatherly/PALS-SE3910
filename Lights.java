public class Lights {
    String color;
    static String[][] floor1;
    static String[][] floor2;
    static String[][] floor3;
    static String[][] floor4;

    public Lights(String color) {
        this.color = color;

    }

    public static void drawLights(int floor) {
        switch (floor) {
        case 1:
            for (int r = 0; r < floor1.length; r++) {
                for (int c = 0; c < floor1.length; c++) {

                }
            }
            break;
        }

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