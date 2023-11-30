package Bai_tap_buoi_6.Bai_1;

import java.util.Scanner;

/**
 * This class use to create a menu for user choose <br>
 * 1 is you choose Square <br>
 * 2 is you choose Circle <br>
 * 3 is you choose Rectangle <br>
 * 4 is you choose exit programs <br>
 *
 * @see Shape - Shape: This class have properties and methods of Shape
 * @see Circle - Circle: This class extends Shape class and have properties, methods of Shape
 * @see Rectangle - Rectangle: This class extends Shape class and have properties, methods of Shape
 * @see Square - Square: This class extends Rectangle class and have properties, methods of Rectangle
 * @author - Le_Van_Anh
 */
public class Menu {
    static Scanner scanner = new Scanner(System.in);

    /**
     * This method use to print Rectangle or Square
     * @param width This is width of Rectangle or Square
     * @param length This is length of Rectangle or Square
     * @param filled This is type of Rectangle or Square(true is fill and false is hollow)
     * @author - Le_Van_Anh
     */
    public static void print(Double width, Double length, Boolean filled) {
        if (filled) {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < length; j++)
                    System.out.print('*');

                System.out.println();
            }
        } else {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < length; j++) {
                    if (i == 0 || i == width - 1 || j == 0 || j == length - 1)
                        System.out.print('*');

                    else
                        System.out.print(" ");
                }

                System.out.println();
            }
        }
    }

    /**
     * This method use to create a menu for user choose <br>
     * @author - Le_Van_Anh
     */
    public static void menu() {
        do {
            System.out.println("1 if you choose Square");
            System.out.println("2 if you choose Circle");
            System.out.println("3 if you choose Rectangle");
            System.out.println("4 if you choose exit programs");

            System.out.print("Enter your choose: ");
            Byte choice = scanner.nextByte();

            switch (choice) {
                case 1:
                    System.out.print("Enter side length: ");
                    Double side = scanner.nextDouble();

                    System.out.print("Enter type you want to paint(true is fill and false is hollow): ");
                    Boolean filled = scanner.nextBoolean();

                    print(side, side, filled);

                    System.out.println("The area of the Square is " + new Square(side).getArea());
                    System.out.println("The perimeter of the Square is " + new Square(side).getPerimeter());

                    break;

                case 2:
                    System.out.print("Enter your Circle radius: ");
                    Double radius = scanner.nextDouble();

                    System.out.println("The area of the Circle is " + new Circle(radius).getArea());
                    System.out.println("The perimeter of the Circle is " + new Circle(radius).getPerimeter());
                    break;

                case 3:
                    Double length = null;
                    Double width = null;

                    do {
                        System.out.print("Enter length of Rectangle: ");
                        length = scanner.nextDouble();

                        System.out.print("Enter width of the Rectangle: ");
                        width = scanner.nextDouble();

                        if(length.compareTo(width) < 0){
                            System.out.println("**********Length is shorter than Width**********");
                        }
                    } while (length < width);

                    System.out.print("Enter type you want to paint(true is fill and false is hollow): ");
                    Boolean filled1 = scanner.nextBoolean();

                    print(width, length, filled1);

                    System.out.println("The area of the Square is " + new Rectangle(width, length).getArea());
                    System.out.println("The perimeter of the Square is " + new Rectangle(width, length).getPerimeter());

                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Your choose will be false, please enter again please !");
                    break;
            }
        } while (true);
    }
}
