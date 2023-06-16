package shapepainter;

import java.awt.Color;
import javax.swing.JColorChooser;

public class ShapeFrame extends javax.swing.JFrame {

    public ShapeFrame() {
        initComponents();
        currColor = Color.BLACK;
        currShape = ShapeType.RECTANGLE; //default to black rectangle 
        DeleteCheckBox.setSelected(false); //delete mode is off by default
    }
    public static double area = 0; //Area starts at 0
    public String areaString; //areaString is used to convert from double to string.

    public void updateConvert() { //Converts area value from double to string and displays on the area label.
        areaString = Double.toString(area);
        areaValue.setText(areaString);

    }

    private int getRandomNumber(int min, int max) {  //Gets a random number given min and max
        return (int) ((Math.random() * (max - min)) + min);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shapeComponent1 = new shapepainter.ShapeComponent();
        jLabel1 = new javax.swing.JLabel();
        areaValue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        colorValue = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        shapeValue = new javax.swing.JLabel();
        deleteLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        fileClear = new javax.swing.JMenuItem();
        DeleteCheckBox = new javax.swing.JCheckBoxMenuItem();
        menuColor = new javax.swing.JMenu();
        colorCustom = new javax.swing.JMenuItem();
        colorBlack = new javax.swing.JMenuItem();
        colorRed = new javax.swing.JMenuItem();
        colorBlue = new javax.swing.JMenuItem();
        colorGreen = new javax.swing.JMenuItem();
        colorWhite = new javax.swing.JMenuItem();
        colorPink = new javax.swing.JMenuItem();
        menuShape = new javax.swing.JMenu();
        shapeRandom = new javax.swing.JMenuItem();
        shapeRectangle = new javax.swing.JMenuItem();
        shapeEllipse = new javax.swing.JMenuItem();
        shapeDiamond = new javax.swing.JMenuItem();
        shapeTriangle = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        shapeComponent1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        shapeComponent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shapeComponent1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                shapeComponent1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                shapeComponent1MouseReleased(evt);
            }
        });

        jLabel1.setText("Total Area:");
        shapeComponent1.add(jLabel1);
        jLabel1.setBounds(10, -10, 70, 40);

        areaValue.setText("0.0");
        shapeComponent1.add(areaValue);
        areaValue.setBounds(10, 20, 100, 20);

        jLabel2.setText("Color:");
        shapeComponent1.add(jLabel2);
        jLabel2.setBounds(10, 50, 40, 17);

        colorValue.setText("Black");
        shapeComponent1.add(colorValue);
        colorValue.setBounds(10, 70, 60, 17);

        jLabel3.setText("Shape:");
        shapeComponent1.add(jLabel3);
        jLabel3.setBounds(10, 100, 41, 17);

        shapeValue.setText("▭");
        shapeComponent1.add(shapeValue);
        shapeValue.setBounds(10, 120, 80, 10);
        shapeComponent1.add(deleteLabel);
        deleteLabel.setBounds(120, 0, 270, 20);

        getContentPane().add(shapeComponent1, java.awt.BorderLayout.CENTER);

        menuFile.setText("File");

        fileClear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.META_DOWN_MASK));
        fileClear.setText("New Drawing");
        fileClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileClearActionPerformed(evt);
            }
        });
        menuFile.add(fileClear);

        DeleteCheckBox.setSelected(true);
        DeleteCheckBox.setText("Delete");
        DeleteCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCheckBoxActionPerformed(evt);
            }
        });
        menuFile.add(DeleteCheckBox);

        jMenuBar1.add(menuFile);

        menuColor.setText("Color");
        menuColor.setAutoscrolls(true);

        colorCustom.setText("Custom");
        colorCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorCustomActionPerformed(evt);
            }
        });
        menuColor.add(colorCustom);

        colorBlack.setText("Black");
        colorBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBlackActionPerformed(evt);
            }
        });
        menuColor.add(colorBlack);

        colorRed.setText("Red");
        colorRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorRedActionPerformed(evt);
            }
        });
        menuColor.add(colorRed);

        colorBlue.setText("Blue");
        colorBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBlueActionPerformed(evt);
            }
        });
        menuColor.add(colorBlue);

        colorGreen.setText("Green");
        colorGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorGreenActionPerformed(evt);
            }
        });
        menuColor.add(colorGreen);

        colorWhite.setText("White");
        colorWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorWhiteActionPerformed(evt);
            }
        });
        menuColor.add(colorWhite);

        colorPink.setText("Pink");
        colorPink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorPinkActionPerformed(evt);
            }
        });
        menuColor.add(colorPink);

        jMenuBar1.add(menuColor);

        menuShape.setText("Shape");

        shapeRandom.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.META_DOWN_MASK));
        shapeRandom.setText("Random");
        shapeRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeRandomActionPerformed(evt);
            }
        });
        menuShape.add(shapeRandom);

        shapeRectangle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.META_DOWN_MASK));
        shapeRectangle.setText("Rectangle");
        shapeRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeRectangleActionPerformed(evt);
            }
        });
        menuShape.add(shapeRectangle);

        shapeEllipse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.META_DOWN_MASK));
        shapeEllipse.setText("Ellipse");
        shapeEllipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeEllipseActionPerformed(evt);
            }
        });
        menuShape.add(shapeEllipse);

        shapeDiamond.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.META_DOWN_MASK));
        shapeDiamond.setText("Diamond");
        shapeDiamond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeDiamondActionPerformed(evt);
            }
        });
        menuShape.add(shapeDiamond);

        shapeTriangle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.META_DOWN_MASK));
        shapeTriangle.setText("Triangle");
        shapeTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeTriangleActionPerformed(evt);
            }
        });
        menuShape.add(shapeTriangle);

        jMenuBar1.add(menuShape);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBlackActionPerformed
        currColor = Color.BLACK;
        colorValue.setText("Black");
    }//GEN-LAST:event_colorBlackActionPerformed

    private void colorBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBlueActionPerformed
        currColor = Color.BLUE;
        colorValue.setText("Blue");
    }//GEN-LAST:event_colorBlueActionPerformed

    private void colorGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorGreenActionPerformed
        currColor = Color.GREEN;
        colorValue.setText("Green");
    }//GEN-LAST:event_colorGreenActionPerformed

    private void colorWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorWhiteActionPerformed
        currColor = Color.WHITE;
        colorValue.setText("White");
    }//GEN-LAST:event_colorWhiteActionPerformed

    private void shapeEllipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeEllipseActionPerformed
        currShape = ShapeType.ELLIPSE;
        shapeValue.setText("○");
    }//GEN-LAST:event_shapeEllipseActionPerformed

    private void fileClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileClearActionPerformed
        shapeComponent1.clearShapes(); //clears shape and takes values back to default
        area = 0;
        updateConvert();
        areaValue.setText(areaString);
    }//GEN-LAST:event_fileClearActionPerformed

    private void colorRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorRedActionPerformed
        currColor = Color.RED;
        colorValue.setText("Red");
    }//GEN-LAST:event_colorRedActionPerformed

    private void colorPinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorPinkActionPerformed
        currColor = Color.PINK;
        colorValue.setText("Pink");
    }//GEN-LAST:event_colorPinkActionPerformed

    private void shapeComponent1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shapeComponent1MousePressed
        startX = evt.getX();
        startY = evt.getY();
    }//GEN-LAST:event_shapeComponent1MousePressed

    private void shapeComponent1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shapeComponent1MouseReleased
        int endX = evt.getX();
        int endY = evt.getY();

        if (Math.abs(startX - endX) < minSize && Math.abs(startY - endY) < minSize) {
            return;
        }
        // Normalize the coordanites
        int minX = Math.min(endX, startX);
        int width = Math.abs(startX - endX);
        int minY = Math.min(endY, startY);
        int height = Math.abs(startY - endY);

        //create a new shape of the selected type
        Shape s;
        switch (currShape) {
            case RECTANGLE:
                s = new Reactangle(minX, minY, width, height, currColor);
                shapeComponent1.addShape(s);
                area += s.getArea(width, height);

                break;
            case ELLIPSE:
                s = new Ellipse(minX, minY, width, height, currColor);
                shapeComponent1.addShape(s);
                area += s.getArea(width, height);

                break;
            case TRIANGLE:
                s = new Triangle(minX, minY, width, height, currColor);
                shapeComponent1.addShape(s);
                area += s.getArea(width, height);

                break;
            case DIAMOND:
                s = new Diamond(minX, minY, width, height, currColor);
                shapeComponent1.addShape(s);
                area += s.getArea(width, height);

                break;

            case RANDOM: //gets a random number and adds shapes acordingly
                int x = getRandomNumber(0, 4);
                if (x == 0) {
                    s = new Reactangle(minX, minY, width, height, currColor);
                    area += s.getArea(width, height);
                    shapeComponent1.addShape(s);

                }
                if (x == 1) {
                    s = new Ellipse(minX, minY, width, height, currColor);
                    area += s.getArea(width, height);
                    shapeComponent1.addShape(s);

                }
                if (x == 2) {
                    s = new Diamond(minX, minY, width, height, currColor);
                    area += s.getArea(width, height);
                    shapeComponent1.addShape(s);

                }
                if (x == 3) {
                    s = new Triangle(minX, minY, width, height, currColor);
                    area += s.getArea(width, height);
                    shapeComponent1.addShape(s);

                }
        }
        updateConvert();
    }//GEN-LAST:event_shapeComponent1MouseReleased

    private void shapeRectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeRectangleActionPerformed
        currShape = ShapeType.RECTANGLE;
        shapeValue.setText("▭");
    }//GEN-LAST:event_shapeRectangleActionPerformed

    private void shapeComponent1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shapeComponent1MouseClicked
        if (DeleteCheckBox.isSelected()) { //If the delete checkbox is selected
            int x = evt.getX();             //delete the shape instead of changing color
            int y = evt.getY();
            shapeComponent1.deleteShape(x, y);
            updateConvert();
        }
        else {
            shapeComponent1.clickShape(evt.getX(), evt.getY(), currColor);
        }
    }//GEN-LAST:event_shapeComponent1MouseClicked

    private void shapeDiamondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeDiamondActionPerformed
        currShape = ShapeType.DIAMOND;
        shapeValue.setText("◇");
    }//GEN-LAST:event_shapeDiamondActionPerformed

    private void shapeTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeTriangleActionPerformed
        currShape = ShapeType.TRIANGLE;
        shapeValue.setText("◿");
    }//GEN-LAST:event_shapeTriangleActionPerformed

    private void shapeRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeRandomActionPerformed
        currShape = ShapeType.RANDOM;
        shapeValue.setText("?");
    }//GEN-LAST:event_shapeRandomActionPerformed

    private void colorCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorCustomActionPerformed
        colorValue.setText("custom");
        Color color = JColorChooser.showDialog(null, "Choose a color", Color.BLACK); // Pop-up custom color chooser
        if (color != null) { //If they selected a color, make that color the current color
            currColor = color;
        }
    }//GEN-LAST:event_colorCustomActionPerformed

    private void DeleteCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCheckBoxActionPerformed
        if (DeleteCheckBox.isSelected()) {  //If delete box is selected, alert the user.
            deleteLabel.setForeground(Color.RED); //sets text color red
            deleteLabel.setText("Delete Mode Turned On!");
        }
        else {
            deleteLabel.setText(""); // If not selected, make the label blank
        }
    }//GEN-LAST:event_DeleteCheckBoxActionPerformed

    public static void main(String args[]) {
        System.setProperty("apple.laf.useScreenMenuBar", "true");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeFrame().setVisible(true);
            }
        });
    }
    private static final int minSize = 10;
    private Color currColor;
    private ShapeType currShape;
    private int startX;
    private int startY;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem DeleteCheckBox;
    private javax.swing.JLabel areaValue;
    private javax.swing.JMenuItem colorBlack;
    private javax.swing.JMenuItem colorBlue;
    private javax.swing.JMenuItem colorCustom;
    private javax.swing.JMenuItem colorGreen;
    private javax.swing.JMenuItem colorPink;
    private javax.swing.JMenuItem colorRed;
    private javax.swing.JLabel colorValue;
    private javax.swing.JMenuItem colorWhite;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JMenuItem fileClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuColor;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuShape;
    private shapepainter.ShapeComponent shapeComponent1;
    private javax.swing.JMenuItem shapeDiamond;
    private javax.swing.JMenuItem shapeEllipse;
    private javax.swing.JMenuItem shapeRandom;
    private javax.swing.JMenuItem shapeRectangle;
    private javax.swing.JMenuItem shapeTriangle;
    private javax.swing.JLabel shapeValue;
    // End of variables declaration//GEN-END:variables
}
