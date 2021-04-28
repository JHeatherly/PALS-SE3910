import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

public class Lights extends JPanel {
    BufferedImage image;
    static int[][] floor1 = new int[8][2];
    static int[][] floor2 = new int[8][2];
    static int[][] floor3 = new int[8][2];
    static int[][] floor4 = new int[8][2];
    static Color[] colors = { Color.green, Color.red, Color.orange, Color.magenta, Color.blue };
    int floor;

    public Lights(int floor, BufferedImage image, boolean set) {
        this.floor = floor;
        if (floor == 1 && !set) {
            setLights();
            set = true;
        }
        this.image = drawLights(floor, image);
    }

    public static void setLights() {
        Random rand = new Random();

        for (int r = 0; r < floor1.length; r++) {
            for (int c = 0; c < floor1[r].length; c++) {
                if (r < 2) {
                    if (rand.nextInt(50) / 10 == 10) {
                        floor1[r][c] = 1;
                    } else {
                        floor1[r][c] = 4;
                    }
                } else if (r == 2) {
                    floor1[r][c] = 3;
                } else {
                    floor1[r][c] = rand.nextInt(30) / 10;
                }
            }
        }

        for (int r = 0; r < floor2.length; r++) {
            for (int c = 0; c < floor2[r].length; c++) {
                if (r < 2) {
                    if (rand.nextInt(50) / 10 == 10) {
                        floor2[r][c] = 1;
                    } else {
                        floor2[r][c] = 4;
                    }
                } else if (r == 2) {
                    floor2[r][c] = 3;
                } else {
                    floor2[r][c] = rand.nextInt(30) / 10;
                }
            }
        }

        for (int r = 0; r < floor3.length; r++) {
            for (int c = 0; c < floor3[r].length; c++) {
                if (r < 2) {
                    if (rand.nextInt(50) / 10 == 10) {
                        floor3[r][c] = 1;
                    } else {
                        floor3[r][c] = 4;
                    }
                } else if (r == 2) {
                    floor3[r][c] = 3;
                } else {
                    floor3[r][c] = rand.nextInt(30) / 10;
                }
            }
        }

        for (int r = 0; r < floor4.length; r++) {
            for (int c = 0; c < floor4[r].length; c++) {
                if (r < 2) {
                    if (rand.nextInt(50) / 10 == 10) {
                        floor4[r][c] = 1;
                    } else {
                        floor4[r][c] = 4;
                    }
                } else if (r == 2) {
                    floor4[r][c] = 3;
                } else {
                    floor4[r][c] = rand.nextInt(30) / 10;
                }
            }
        }
        DrawFloors.cycleReady = true;
    }

    public int getAllCount() {
        return getFloor1Count() + getFloor2Count() + getFloor3Count() + getFloor4Count();
    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 305, 0, null);
    }

    public static BufferedImage drawLights(int floor, BufferedImage image) {
        Graphics2D g2d = image.createGraphics();
        switch (floor) {
        case 1:
            for (int r = 0; r < floor1.length; r++) {
                for (int c = 0; c < floor1[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(colors[floor1[r][c]]);
                        g2d.drawOval(55, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(55, 55 + (45 * r + 1), 15, 15);

                    } else {
                        g2d.setColor(colors[floor1[r][c]]);
                        g2d.drawOval(190, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(190, 55 + (45 * r + 1), 15, 15);

                    }
                }
            }
            break;
        case 2:
            for (int r = 0; r < floor2.length; r++) {
                for (int c = 0; c < floor2[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(colors[floor2[r][c]]);
                        g2d.drawOval(55, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(55, 55 + (45 * r + 1), 15, 15);

                    } else {
                        g2d.setColor(colors[floor2[r][c]]);
                        g2d.drawOval(190, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(190, 55 + (45 * r + 1), 15, 15);

                    }
                }
            }
            break;
        case 3:
            for (int r = 0; r < floor3.length; r++) {
                for (int c = 0; c < floor3[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(colors[floor3[r][c]]);
                        g2d.drawOval(55, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(55, 55 + (45 * r + 1), 15, 15);

                    } else {
                        g2d.setColor(colors[floor3[r][c]]);
                        g2d.drawOval(190, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(190, 55 + (45 * r + 1), 15, 15);

                    }
                }
            }
            break;
        case 4:
            for (int r = 0; r < floor4.length; r++) {
                for (int c = 0; c < floor4[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(colors[floor4[r][c]]);
                        g2d.drawOval(55, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(55, 55 + (45 * r + 1), 15, 15);

                    } else {
                        g2d.setColor(colors[floor4[r][c]]);
                        g2d.drawOval(190, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(190, 55 + (45 * r + 1), 15, 15);
                    }
                }
            }
            break;
        }
        return image;
    }

    public static int getFloor1Count() {
        int count = 0;
        for (int i = 0; i < floor1.length; i++) {
            for (int j = 0; j < floor1[i].length; j++) {
                if (floor1[i][j] == 1) {
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
                if (floor2[i][j] == 1) {
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
                if (floor3[i][j] == 1) {
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
                if (floor4[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}