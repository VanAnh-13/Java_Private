package baitapbuoi8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This class is used to create menu
 *
 * @author LeVanAnh
 */
public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static StudentArrayList studentArrayList = new StudentArrayList();

    public static void display(List<Student> listStudent) {
        System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Id", "Name", "Age", "Address", "GPA");

        listStudent.forEach(student -> {
            System.out.printf("%-20d%-20s%-20d%-20s%.3f\n", student.getId(), student.getName(), student.getAge(), student.getAddress(), student.getGpa());
        });
    }

    /**
     * This method is used to show menu
     */
    public static void menu() {
        Byte choice;

        do {
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Display student");
            System.out.println("4. Search student");
            System.out.println("5. Sort student");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            choice = scanner.nextByte();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.printf("%5sEnter the name of student: ", " ");
                    String name = scanner.nextLine();

                    System.out.printf("%5sEnter the age of student: ", " ");
                    Integer age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.printf("%5sEnter the address of student: ", " ");
                    String address = scanner.nextLine();

                    System.out.printf("%5sEnter the gpa of student: ", " ");
                    Double gpa = scanner.nextDouble();
                    scanner.nextLine();

                    studentArrayList.add(new Student(name, age, address, gpa));
                    break;
                case 2:
                    try {
                        System.out.println("Enter the index of student you want to delete: ");
                        Integer index = scanner.nextInt();
                        studentArrayList.delete(index);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    display(studentArrayList.getData());
                    break;
                case 4:
                    System.out.println("Enter the name of student you want to search: ");
                    String name1 = scanner.nextLine();

                    List<Student> studentList = studentArrayList.getData().stream()
                            .filter(student -> student.getName().equals(name1))
                            .toList();

                    display(studentList);

                    break;
                case 5:
                    System.out.println("Enter the comparator you want to use: ");
                    String comparator;

                    do {
                        comparator = scanner.nextLine();
                        comparator = comparator.toLowerCase();
                    } while (!comparator.equals("a") && !comparator.equals("b") && !comparator.equals("c") && !comparator.equals("d"));

                    switch (comparator) {
                        case "a":
                            studentArrayList.sort((student1, student2) -> {
                                if (student1.getAge() > student2.getAge())
                                    return true;
                                return false;
                            });

                            break;

                        case "b":
                            studentArrayList.sort((student1, student2) -> {
                                if (student1.getGpa() > student2.getGpa())
                                    return true;
                                return false;
                            });

                            break;

                        case "c":
                            studentArrayList.sort((student1, student2) -> {
                                if (student1.getAge() > student2.getAge()) {
                                    return true;
                                } else if (student1.getAge() == student2.getAge()) {
                                    if (student1.getGpa() < student2.getGpa()) {
                                        return true;
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            });

                            break;

                        case "d":
                            StudentArrayList studentArrayList1 = new StudentArrayList();
                            List<Student> evenAge = studentArrayList.getData().stream()
                                    .filter(student -> student.getAge() % 2 == 0)
                                    .collect(Collectors.toList());
                            studentArrayList1.setData(evenAge);

                            StudentArrayList studentArrayList2 = new StudentArrayList();
                            List<Student> oddAge = studentArrayList.getData().stream()
                                    .filter(student -> student.getAge() % 2 != 0)
                                    .collect(Collectors.toList());
                            studentArrayList2.setData(oddAge);

                            studentArrayList1.sort((student1, student2) -> {
                                if (student1.getAge() > student2.getAge()) {
                                    return true;
                                } else if (student1.getAge() == student2.getAge()) {
                                    if (student1.getGpa() > student2.getGpa()) {
                                        return true;
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            });

                            studentArrayList2.sort((student1, student2) -> {
                                if (student1.getAge() < student2.getAge()) {
                                    return true;
                                } else if (student1.getAge() == student2.getAge()) {
                                    if (student1.getGpa() > student2.getGpa()) {
                                        return true;
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            });

                            List<Student> studentList1 = studentArrayList1.getData();
                            studentList1.addAll(studentArrayList2.getData());

                            break;
                    }

                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);
    }
}
