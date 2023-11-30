package Bai_tap_buoi_6.Bai_1;

/**
 * This class use to create a shape
 *
 * @author - Le_Van_Anh
 * @see Circle - Circle: This class extends Shape class and have properties, methods of Shape
 * @see Rectangle - Rectangle: This class extends Shape class and have properties, methods of Shape
 * @see Square - Square: This class extends Rectangle class and have properties, methods of Rectangle
 */
public abstract class Shape {
    // Object properties
    protected String color;
    protected Boolean filled;

    // Constructor
    public Shape() {
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Setter and Getter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    // Other method
    /**
     * This abstract method use to get area to subclass extend
     *
     * @return - The value of area
     * @author - Le_Van_Anh
     */
    public abstract Double getArea();

    /**
     * This abstract method use to get perimeter to subclass extend
     *
     * @return - The value of perimeter
     * @author - Le_Van_Anh
     */
    public abstract Double getPerimeter();

    /**
     * This method use to return the color of the shape
     *
     * @return - The color of the shape
     * @author - Le_Van_Anh
     */
    @Override
    public String toString() {
        return "Color: " + this.getColor();
    }
}
