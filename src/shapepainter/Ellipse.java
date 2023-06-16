package shapepainter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

public class Ellipse extends Shape {

    private Ellipse2D e;

    public Ellipse(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
        e = new Ellipse2D.Double(x, y, width, height);
    }

    @Override
    public void draw(Graphics g) { //sets the color of the shape and draws it
        g.setColor(color);
        g.fillOval(x, y, width, height);

    }

    @Override
    public boolean hitTest(int clickX, int clickY) {
        return e.contains(clickX, clickY);
    }

    @Override
    public int getArea(int width, int length) {
        return (int) ((width / 2) * (height / 2) * Math.PI); //calculates area of the ellips and returns

    }

}
