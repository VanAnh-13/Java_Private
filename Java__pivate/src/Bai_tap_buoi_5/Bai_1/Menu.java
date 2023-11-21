package Bai_tap_buoi_5.Bai_1;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void menu() {

        ClassRoom classRoom = new ClassRoom();

        int choice;

        do {

            System.out.println("1. Input list student (until you enter id = 555)");
            System.out.println("2. Output list student");
            System.out.println("3. Sort by gpa");
            System.out.println("4. Remove student by id");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    classRoom.inputListStudent();
                    break;

                case 2:
                    classRoom.outputListStudent();
                    break;

                case 3:
                    classRoom.sortByGpa();
                    System.out.println("Sort by gpa success");
                    classRoom.outputListStudent();
                    break;

                case 4:
                    System.out.print("Enter id to remove: ");
                    Integer id = scanner.nextInt();
                    classRoom.removeStudentById(id);
                    System.out.println("Remove success");
                    classRoom.outputListStudent();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 5);
    }
}
