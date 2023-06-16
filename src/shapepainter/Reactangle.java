package shapepainter;

import java.awt.Color;
import java.awt.Graphics;

public class Reactangle extends Shape {

    public Reactangle(int x, int y, int width, int height, Color color) { //paramaters for rectangle
        super(x, y, width, height, color);
    }

    @Override
    public void draw(Graphics g) { //draws rectangle
        g.setColor(color);
        g.fillRect(x, y, width, height);

    }

    @Override
    public boolean hitTest(int clickX, int clickY) {
        return (clickX >= x && clickX <= x + width && clickY >= y && clickY <= y + width);
    }

    @Override
    public int getArea(int width, int length) {//returns area of rectangle
        return (width * height);

    }

}
