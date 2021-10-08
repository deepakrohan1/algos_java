package org.example.oops.solid;

/**
 * You should be able substitube sub class for base class
 */
public class LiskovSubstitutionPrinciple {
    /**
     * This method is failing for a square since the set sets height and
     * width in square
     * @param r
     */
    static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println(String.format("Expected Area = %s" +
                " But Actual Area = %s", (width * 10), r.getArea()));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,3);
        useIt(r);
        // TODO Trying Liskov's Principle a child element substuting for parent
        Rectangle s = new Square(5);
        useIt(s);
    }
}

class Rectangle {
    protected int height;
    protected int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return this.width * this.height;
    }
}

class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(int size) {
        super(size, size);
    }

    /**
     * This setHeight and setWidth both set height and width a bad practice
     * @param width
     */
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}

/**
 * Use a factory pattern to create necessary ones
 */
class RectangleFactory {
    public static Rectangle newRectangle(int width, int height) {
        return new Rectangle(width, height);
    }
    public static Rectangle newSquare(int side) {
        return new Rectangle(side, side);
    }
}