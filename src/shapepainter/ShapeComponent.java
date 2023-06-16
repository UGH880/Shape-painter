package shapepainter;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;
import static shapepainter.ShapeFrame.area;

public class ShapeComponent extends JComponent {

    private ArrayList<Shape> shapes;

    public ShapeComponent() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) { //Adds a shape to the array list
        shapes.add(s);
        repaint();
    }

    public void clearShapes() { //Clears the Arraylist
        shapes.clear();
        repaint();
    }

    public void clickShape(int x, int y, Color c) { //Goes backwards through the list to change color
        for (int i = shapes.size() - 1; i >= 0; i--) {
            Shape s = shapes.get(i);
            if (s.hitTest(x, y)) {
                s.setColor(c);
                break;
            }
        }
        repaint();
    }

    public void deleteShape(int x, int y) {       //Goes through the list backwards to delete shape
        for (int i = shapes.size() - 1; i >= 0; i--) {
            Shape s = shapes.get(i);
            if (s.hitTest(x, y)) {
                area -= s.getArea(s.width, s.height);
                shapes.remove(s);
                break;

            }

        }
        repaint();

    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        for (Shape s : shapes) {
            s.draw(g);
        }
    }

}
