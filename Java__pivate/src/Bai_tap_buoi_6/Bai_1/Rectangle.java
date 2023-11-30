package Bai_tap_buoi_6.Bai_1;

/**
 * This class use to create a Rectangle extends from Shape class
 *
 * @author - Le_Van_Anh
 * @see Shape - Shape: This class have properties and methods of Circle
 * @see Circle - Circle: This class extends Shape class and have properties, methods of Shape
 * @see Square - Square: This class extends Rectangle class and have properties, methods of Rectangle
 */
public class Rectangle extends Shape {
    // Object properties
    protected Double width;
    protected Double length;

    // Constructor
    public Rectangle() {
    }

    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, Double width, Double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //Getter and Setter
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    // Other method
    /**
     * This method use to return area of rectangle
     *
     * @return - the value of rectangle
     * @author - Le_Van_Anh
     */
    @Override
    public Double getArea() {
        return getLength() * getWidth();
    }

    /**
     * This method use to return perimeter of rectangle
     *
     * @return - the value of perimeter
     * @author - Le_Van_Anh
     */
    @Override
    public Double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }

    /**
     * This method use to return the color, the width and the length of rectangle
     *
     * @return - the color, the width and the length of rectangle
     * @author - Le_Van_Anh
     */
    @Override
    public String toString() {
        return super.toString() + ", Width: " + getWidth() + ", Length: " + getLength();
    }
}
