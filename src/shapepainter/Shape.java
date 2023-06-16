package shapepainter;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected Color color;

    public Shape(int x, int y, int width, int height, Color color) { //things that all shapes have

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setColor(Color c) { //function to set color of shapes
        color = c;
    }

    public abstract void draw(Graphics g);

    public abstract boolean hitTest(int clickX, int clickY);

    public abstract int getArea(int width, int length);

}
