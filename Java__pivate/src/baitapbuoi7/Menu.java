package baitapbuoi7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * class Menu is a class that represents a menu<br>
 * class Menu is a class that contains a method displayMenu()<br>
 *
 * @author Le_Van_Anh
 * @see Scanner
 * @see Student
 * @see Course
 * @see University
 * @see Person
 * @see Displayable
 */
public class Menu {
    static Scanner sc = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();
    static List<Course> courses = new ArrayList<>();

    /**
     * method displayMenu() is a method that display menu
     */
    public static void displayMenu() {
        System.out.println("1. Add student");
        System.out.println("2. Add course");
        System.out.println("3. Display student");
        System.out.println("4. Display course");
        System.out.println("5. Remove student");
        System.out.println("6. Remove course");
        System.out.println("7. Enroll student in course");
        System.out.println("8. Exit");

        Byte choice = 0;

        do {
            System.out.println("Enter your choice: ");
            choice = sc.nextByte();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID: ");
                    Integer id = sc.nextInt();

                    System.out.println("Enter student name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.println("Enter student age: ");
                    Byte age = sc.nextByte();

                    System.out.println("Enter student grade: ");
                    sc.nextLine();
                    String grade = sc.nextLine();

                    Student student = new Student(id, name, age, grade);
                    students.add(student);
                    System.out.println("Add student successfully!");

                    break;

                case 2:
                    System.out.println("Enter course ID: ");
                    String courseId = sc.nextLine();

                    System.out.println("Enter course name: ");
                    String courseName = sc.nextLine();

                    List<Student> studentOfCourse = new ArrayList<>();
                    System.out.print("Enter number of student in course: ");
                    int numberOfStudent = sc.nextInt();

                    for (int i = 0; i < numberOfStudent; i++) {
                        System.out.println("Enter student " + (i + 1) + ": ");

                        System.out.println("Enter student ID: ");
                        Integer id1 = sc.nextInt();

                        System.out.println("Enter student name: ");
                        sc.nextLine();
                        String name1 = sc.nextLine();

                        System.out.println("Enter student age: ");
                        Byte age1 = sc.nextByte();

                        System.out.println("Enter student grade: ");
                        sc.nextLine();
                        String grade1 = sc.nextLine();

                        Student student1 = new Student(id1, name1, age1, grade1);
                        studentOfCourse.add(student1);
                    }

                    Course course = new Course(courseId, courseName, studentOfCourse);
                    courses.add(course);
                    System.out.println("Add course successfully!");

                    break;

                case 3:
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "ID", "Name", "Age", "Grade", "Course ID", "Course Name");
                    students.forEach(student1 -> {
                        student1.displayInfor();

                        courses.stream().filter(course1 -> course1.getStudents().equals(student1)).forEach(course1 -> {
                            System.out.printf("%-20s%-20s\n", course1.getCourseId(), course1.getCourseName());
                        });
                        System.out.println();
                    });

                    break;

                case 4:
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "ID", "Name", "Age", "Grade", "Course ID", "Course Name");
                    courses.forEach(course1 -> {
                        course1.displayInfor();
                    });

                    break;

                case 5:
                    System.out.println("Enter student ID: ");
                    Integer id2 = sc.nextInt();

                    students.removeIf(student1 -> student1.getId().equals(id2));
                    System.out.println("Remove student successfully!");

                    break;

                case 6:
                    System.out.println("Enter course ID: ");
                    String courseId1 = sc.nextLine();

                    courses.removeIf(course1 -> course1.getCourseId().equals(courseId1));
                    System.out.println("Remove course successfully!");

                    break;

                case 7:
                    University university = new University(students, courses);
                    break;

                case 8:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        } while (true);
    }
}
