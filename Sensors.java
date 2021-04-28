import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

public class Sensors extends JPanel {
    BufferedImage image;
    int floor;

    public Sensors(int floor, BufferedImage image, boolean set) {
        this.floor = floor;
        this.image = drawSensors(floor, image);
    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 305, 0, null);
    }

    public static BufferedImage drawSensors(int floor, BufferedImage image) {
        Graphics2D g2d = image.createGraphics();
        switch (floor) {
        case 1:
            for (int r = 0; r < Lights.floor1.length; r++) {
                for (int c = 0; c < Lights.floor1[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(Color.black);
                        g2d.drawOval(80, 55 + (45 * r + 1), 5, 5);
                        g2d.fillOval(80, 55 + (45 * r + 1), 5, 5);
                    } else {
                        g2d.setColor(Color.black);
                        g2d.drawOval(165, 55 + (45 * r + 1), 5, 5);
                        g2d.fillOval(165, 55 + (45 * r + 1), 5, 5);
                    }
                }
            }
            break;
        case 2:
            for (int r = 0; r < Lights.floor2.length; r++) {
                for (int c = 0; c < Lights.floor2[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(Color.black);
                        g2d.drawOval(80, 55 + (45 * r + 1), 5, 5);
                        g2d.fillOval(80, 55 + (45 * r + 1), 5, 5);
                    } else {
                        g2d.setColor(Color.black);
                        g2d.drawOval(165, 55 + (45 * r + 1), 5, 5);
                        g2d.fillOval(165, 55 + (45 * r + 1), 5, 5);
                    }
                }
            }
            break;
        case 3:
            for (int r = 0; r < Lights.floor3.length; r++) {
                for (int c = 0; c < Lights.floor3[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(Color.black);
                        g2d.drawOval(80, 55 + (45 * r + 1), 5, 5);
                        g2d.fillOval(80, 55 + (45 * r + 1), 5, 5);
                    } else {
                        g2d.setColor(Color.black);
                        g2d.drawOval(165, 55 + (45 * r + 1), 5, 5);
                        g2d.fillOval(165, 55 + (45 * r + 1), 5, 5);
                    }
                }
            }
            break;
        case 4:
            for (int r = 0; r < Lights.floor4.length; r++) {
                for (int c = 0; c < Lights.floor4[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(Color.black);
                        g2d.drawOval(80, 55 + (45 * r + 1), 5, 5);
                        g2d.fillOval(80, 55 + (45 * r + 1), 5, 5);
                    } else {
                        g2d.setColor(Color.black);
                        g2d.drawOval(165, 55 + (45 * r + 1), 5, 5);
                        g2d.fillOval(165, 55 + (45 * r + 1), 5, 5);
                    }
                }
            }
            break;
        }
        return image;
    }

    public void simNewCars(int floor) {
        Graphics2D g2d = image.createGraphics();
        Random rand = new Random();

        int y = rand.nextInt(2);
        int x = rand.nextInt(8);

        if (rand.nextInt(100) > 70) {
            switch (floor) {
            case 1:
                if (x == 0) {
                    g2d.setColor(Color.red);
                    g2d.drawOval(55, 55 + (45 * y + 1), 15, 15);
                    g2d.fillOval(55, 55 + (45 * y + 1), 15, 15);

                } else {
                    g2d.setColor(Color.red);
                    g2d.drawOval(190, 55 + (45 * y + 1), 15, 15);
                    g2d.fillOval(190, 55 + (45 * y + 1), 15, 15);
                }
                Lights.floor1[x][y] = 1;
                break;
            case 2:
                if (x == 0) {
                    g2d.setColor(Color.red);
                    g2d.drawOval(55, 55 + (45 * y + 1), 15, 15);
                    g2d.fillOval(55, 55 + (45 * y + 1), 15, 15);

                } else {
                    g2d.setColor(Color.red);
                    g2d.drawOval(190, 55 + (45 * y + 1), 15, 15);
                    g2d.fillOval(190, 55 + (45 * y + 1), 15, 15);
                }
                Lights.floor2[x][y] = 1;
                break;
            case 3:
                if (x == 0) {
                    g2d.setColor(Color.red);
                    g2d.drawOval(55, 55 + (45 * y + 1), 15, 15);
                    g2d.fillOval(55, 55 + (45 * y + 1), 15, 15);

                } else {
                    g2d.setColor(Color.red);
                    g2d.drawOval(190, 55 + (45 * y + 1), 15, 15);
                    g2d.fillOval(190, 55 + (45 * y + 1), 15, 15);
                }
                Lights.floor3[x][y] = 1;
                break;
            case 4:
                if (x == 0) {
                    g2d.setColor(Color.red);
                    g2d.drawOval(55, 55 + (45 * y + 1), 15, 15);
                    g2d.fillOval(55, 55 + (45 * y + 1), 15, 15);

                } else {
                    g2d.setColor(Color.red);
                    g2d.drawOval(190, 55 + (45 * y + 1), 15, 15);
                    g2d.fillOval(190, 55 + (45 * y + 1), 15, 15);
                }
                Lights.floor4[x][y] = 1;
                break;
            }
        } else {
            if (y < 2) {
                if (rand.nextInt(50) / 10 == 10) {
                    Lights.floor1[x][y] = 1;
                } else {
                    Lights.floor1[x][y] = 4;
                }
            } else if (y == 2) {
                Lights.floor1[x][y] = 3;
            } else {
                Lights.floor1[x][y] = rand.nextInt(30) / 10;
            }
            if (y < 2) {
                if (rand.nextInt(50) / 10 == 10) {
                    Lights.floor2[x][y] = 1;
                } else {
                    Lights.floor2[x][y] = 4;
                }
            } else if (y == 2) {
                Lights.floor2[x][y] = 3;
            } else {
                Lights.floor2[x][y] = rand.nextInt(30) / 10;
            }
            if (y < 2) {
                if (rand.nextInt(50) / 10 == 10) {
                    Lights.floor3[x][y] = 1;
                } else {
                    Lights.floor3[x][y] = 4;
                }
            } else if (y == 2) {
                Lights.floor3[x][y] = 3;
            } else {
                Lights.floor3[x][y] = rand.nextInt(30) / 10;
            }
        }
        if (y < 2) {
            if (rand.nextInt(50) / 10 == 10) {
                Lights.floor4[x][y] = 1;
            } else {
                Lights.floor4[x][y] = 4;
            }
        } else if (y == 2) {
            Lights.floor4[x][y] = 3;
        } else {
            Lights.floor4[x][y] = rand.nextInt(30) / 10;
        }
    }

    public BufferedImage powerOut() {
        Graphics2D g2d = image.createGraphics();
        switch (floor) {
        case 1:
            for (int r = 0; r < Lights.floor1.length; r++) {
                for (int c = 0; c < Lights.floor1[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(Color.orange);
                        g2d.drawOval(55, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(55, 55 + (45 * r + 1), 15, 15);

                    } else {
                        g2d.setColor(Color.orange);
                        g2d.drawOval(190, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(190, 55 + (45 * r + 1), 15, 15);

                    }
                }
            }
            break;
        case 2:
            for (int r = 0; r < Lights.floor2.length; r++) {
                for (int c = 0; c < Lights.floor2[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(Color.orange);
                        g2d.drawOval(55, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(55, 55 + (45 * r + 1), 15, 15);

                    } else {
                        g2d.setColor(Color.orange);
                        g2d.drawOval(190, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(190, 55 + (45 * r + 1), 15, 15);

                    }
                }
            }
            break;
        case 3:
            for (int r = 0; r < Lights.floor3.length; r++) {
                for (int c = 0; c < Lights.floor3[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(Color.orange);
                        g2d.drawOval(55, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(55, 55 + (45 * r + 1), 15, 15);

                    } else {
                        g2d.setColor(Color.orange);
                        g2d.drawOval(190, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(190, 55 + (45 * r + 1), 15, 15);

                    }
                }
            }
            break;
        case 4:
            for (int r = 0; r < Lights.floor4.length; r++) {
                for (int c = 0; c < Lights.floor4[r].length; c++) {
                    if (c == 0) {
                        g2d.setColor(Color.orange);
                        g2d.drawOval(55, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(55, 55 + (45 * r + 1), 15, 15);

                    } else {
                        g2d.setColor(Color.orange);
                        g2d.drawOval(190, 55 + (45 * r + 1), 15, 15);
                        g2d.fillOval(190, 55 + (45 * r + 1), 15, 15);
                    }
                }
            }
            break;
        }
        return image;
    }
}
