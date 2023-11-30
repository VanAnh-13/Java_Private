package Bai_tap_buoi_6.Bai_1;

/**
 * This class use to create a Circle extends from Shape class
 *
 * @author - Le_Van_Anh
 * @see Shape - Shape: This class have properties and methods of Circle
 * @see Rectangle - Rectangle: This class extends Shape class and have properties, methods of Shape
 * @see Square - Square: This class extends Rectangle class and have properties, methods of Rectangle
 */
public class Circle extends Shape {
    // Object properties
    private Double radius;

    // Constructor
    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, Double radius) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and Setter
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    // Other method
    /**
     * This method use to return area of circle
     *
     * @return - The value of area
     * @author - Le_Van_Anh
     */
    @Override
    public Double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    /**
     * This method use to return perimeter of circle
     *
     * @return - the value of perimeter
     * @author - Le_Van_Anh
     */
    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    /**
     * This method use to return the color and the radius of circle
     *
     * @return - the color and the radius of circle
     * @author - Le_Van_Anh
     */
    @Override
    public String toString() {
        return super.toString() + " " + ", Radius: " + getRadius();
    }
}
