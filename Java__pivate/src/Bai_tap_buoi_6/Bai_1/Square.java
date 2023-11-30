package Bai_tap_buoi_6.Bai_1;

/**
 * This class use to create a Square extends from Rectangle class
 *
 * @author - Le_Van_Anh
 * @see Shape - Shape: This class have properties and methods of Shape
 * @see Circle - Circle: This class extends Shape class and have properties, methods of Shape
 * @see Rectangle - Rectangle: This class extends Shape class and have properties, methods of Shape
 * @see Square - Square: This class extends Rectangle class and have properties, methods of Rectangle
 */
public class Square extends Rectangle {
    // Constructor
    public Square() {
    }

    public Square(Double side) {
        super(side, side);
    }

    public Square(String color, Boolean filled, Double side) {
        super(color, filled, side, side);
    }

    // Getter and Setter
    public Double getSide() {
        return getWidth();
    }

    public void setSide(Double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(Double side) {
        super.setWidth(side);
    }

    public void setLength(Double side) {
        super.setLength(side);
    }

    // Other method
    /**
     * Method toString() use to return a string of information Square
     * @return - a string of information Square
     * @author - Le_Van_Anh
     */
    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
