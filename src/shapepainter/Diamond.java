package shapepainter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Diamond extends Shape {

    private Polygon d;

    public Diamond(int x, int y, int width, int height, Color color) { //paramaters for diamond
        super(x, y, width, height, color);

        int[] xValues = {x, x + width / 2, x + width, x + width / 2}; // x valued needed for Diamond
        int[] yValues = {y + height / 2, y, y + height / 2, y + height}; //respective y values needed for Diamond

        d = new Polygon(xValues, yValues, 4); //creates the diamond using the above x and y values.
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(d);
    }

    @Override
    public boolean hitTest(int clickX, int clickY) {
        return d.contains(clickX, clickY);
    }

    @Override
    public int getArea(int width, int length) { //returns the area of the diamond
        return ((width * height) / 2);

    }
}
