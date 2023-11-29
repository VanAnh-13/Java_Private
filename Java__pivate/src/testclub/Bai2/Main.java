package testclub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentServiceImpl studentService = new StudentServiceImpl();

        Byte choice;

        do{
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Search student");
            System.out.println("4. Sort student");
            System.out.println("5. Show all student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextByte();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter your district: ");
                    String district = scanner.nextLine();

                    System.out.print("Enter your city: ");
                    String city = scanner.nextLine();

                    Address address = new Address(district, city);
                    Student student = new Student();

                    System.out.print("Enter name of student: ");
                    String name = scanner.nextLine();
                    student.setName(name);

                    System.out.print("Enter age of student: ");
                    Short age = scanner.nextShort();
                    student.setAge(age);

                    System.out.print("Enter student core: ");
                    Double score = scanner.nextDouble();
                    student.setScore(score);

                    studentService.addStudent(student);
                    break;

                case 2:
                    System.out.print("Enter id student you want to detele: ");
                    Integer id = scanner.nextInt();
                    studentService.deleteStudent(id);
                    break;

                case 3:
                    System.out.print("Enter name student you want to find: ");
                    String name1 = scanner.nextLine();
                    studentService.searchStudent(name1);
                    break;

                case 4:
                    studentService.sortStudent();
                    break;

                case 5:
                    studentService.showAllStudent();
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Your choose will be lose !");
                    break;
            }
        }while(choice <= 6);
    }
}
