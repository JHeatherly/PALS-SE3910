import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class DrawFloors extends javax.swing.JFrame {

        static int currFloor = 1;

        public DrawFloors() {
                cycleReady = false;
                set = false;
                listenUp = true;
                listenDown = true;
                setResizable(false);
                setMinimumSize(new java.awt.Dimension(565, 541));
                setMaximumSize(new java.awt.Dimension(565, 541));
                down = new javax.swing.JButton();
                pic = new javax.swing.JLabel();
                up = new javax.swing.JButton();
                currFloorText = new javax.swing.JTextArea();
                floor3 = new javax.swing.JTextArea();
                floor1 = new javax.swing.JTextArea();
                floor4 = new javax.swing.JTextArea();
                floor2 = new javax.swing.JTextArea();
                initComponents();
        }

        private void initComponents() {
                cycleReady = false;

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                if (!set) {
                        try {
                                image = ImageIO.read(new File("parkinglot.jpg"));
                                image2 = image;
                        } catch (java.io.IOException e) {
                                System.out.println("Image not found");
                        }
                        pic.setIcon(new javax.swing.ImageIcon(image)); // NOI18N
                        pic.setText("pic");
                }
                lights = new Lights(currFloor, image, set);
                sensor = new Sensors(currFloor, image2, set);
                set = true;
                down.setText("Go Down");
                down.setActionCommand("Floor 2");
                down.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if (e.getSource() == down) {
                                        if (currFloor > 1) {
                                                currFloor -= 1;
                                                currFloorText.setText("Current Floor: " + currFloor
                                                                + "\nAll Floor Count: " + lights.getAllCount());
                                                updateFrame();
                                        }
                                }
                        }
                });
                up.setText("Go Up");
                up.setActionCommand("Floor 1");

                up.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if (e.getSource() == up) {
                                        if (currFloor < 4) {
                                                currFloor += 1;
                                                currFloorText.setText("Current Floor: " + currFloor
                                                                + "\nAll Floor Count: " + lights.getAllCount());
                                                updateFrame();
                                        }
                                }
                        }
                });

                currFloorText.setFocusable(false);
                currFloorText.setBorder(
                                javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                currFloorText.setColumns(20);
                currFloorText.setRows(5);
                currFloorText.setText("Current Floor: " + currFloor + "\nAll Floor Count: " + lights.getAllCount());

                floor3.setColumns(20);
                floor3.setRows(5);
                floor3.setText("Floor 3: " + Lights.getFloor3Count());

                floor1.setColumns(20);
                floor1.setRows(5);
                floor1.setText("Floor 1: " + Lights.getFloor1Count());

                floor4.setEditable(false);
                floor4.setColumns(20);
                floor4.setRows(5);
                floor4.setText("Floor 4: " + Lights.getFloor4Count());

                floor2.setColumns(20);
                floor2.setRows(5);
                floor2.setText("Floor 2: " + Lights.getFloor2Count());

                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addComponent(up,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 111,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(down,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                111,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup().addComponent(currFloorText,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 277,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 4, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(floor3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                111,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(floor1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                111,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(floor4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                111,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(floor2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                111,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)));
                layout.setVerticalGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                                                .createSequentialGroup().addContainerGap().addComponent(
                                                                currFloorText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(down,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                43,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(up,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                43,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup().addComponent(
                                                                                floor1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                57,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(floor3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                57,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup().addComponent(
                                                                                floor2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                57,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(floor4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                57,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup().addComponent(pic).addGap(0, 100,
                                                Short.MAX_VALUE)));

                pack();

        }// </editor-fold>

        public static void draw() {
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(DrawFloors.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(DrawFloors.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(DrawFloors.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(DrawFloors.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new DrawFloors().setVisible(true);
                        }
                });

        }

        public void updateFrame() {
                lights = new Lights(currFloor, image, set);
                sensor = new Sensors(currFloor, image2, set);
                sensor.simNewCars(currFloor);
                currFloorText.setText("Current Floor: " + currFloor + "\nAll Floor Count: " + lights.getAllCount());
                floor3.setText("Floor 3: " + Lights.getFloor3Count());
                floor1.setText("Floor 1: " + Lights.getFloor1Count());
                floor4.setText("Floor 4: " + Lights.getFloor4Count());
                floor2.setText("Floor 2: " + Lights.getFloor2Count());
                sensor.powerOut();
                currFloorText.setText("Current Floor: N/A\nAll Floor Count: N/A");
                floor3.setText("Floor 3: N/A");
                floor1.setText("Floor 1: N/A");
                floor4.setText("Floor 4: N/A");
                floor2.setText("Floor 2: N/A");
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addComponent(up,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 111,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(down,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                111,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup().addComponent(currFloorText,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 277,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 4, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(floor3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                111,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(floor1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                111,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(floor4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                111,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(floor2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                111,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)));
                layout.setVerticalGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                                                .createSequentialGroup().addContainerGap().addComponent(
                                                                currFloorText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(down,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                43,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(up,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                43,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup().addComponent(
                                                                                floor1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                57,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(floor3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                57,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup().addComponent(
                                                                                floor2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                57,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(floor4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                57,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup().addComponent(pic).addGap(0, 100,
                                                Short.MAX_VALUE)));
        }

        // Variables declaration
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        private Lights lights;
        private Sensors sensor;
        private boolean listenUp, listenDown;
        private boolean set;
        public static boolean cycleReady;
        private BufferedImage image, image2;
        private javax.swing.JButton down;
        private javax.swing.JButton up;
        public static javax.swing.JLabel pic;
        private javax.swing.JTextArea currFloorText;
        private javax.swing.JTextArea floor3;
        private javax.swing.JTextArea floor1;
        private javax.swing.JTextArea floor4;
        private javax.swing.JTextArea floor2;
        // End of variables declaration
}
