package shapepainter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon; //import polygon

public class Triangle extends Shape {

    private Polygon t; //new polygon

    public Triangle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);

        int[] xValues = {x + width, x, x + width}; //The x values of points needed
        int[] yValues = {y + height, y + height, y}; // The respective y values of points needed

        t = new Polygon(xValues, yValues, 3); //Giving polyon the needed values
    }

    @Override
    public void draw(Graphics g) { //drawing triangle
        g.setColor(color);
        g.fillPolygon(t);
    }

    @Override
    public boolean hitTest(int clickX, int clickY) {
        return t.contains(clickX, clickY);
    }

    @Override
    public int getArea(int width, int length) { //returns area of triangle
        return (width * height / 2);

    }
}
