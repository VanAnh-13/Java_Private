package Bai_tap_buoi_6.Bai_2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Class Menu is used to display menu
 *
 * @author - Le_Van_Anh
 * @see Employee - Employee is an abstract class that implements IEmployee
 * @see IEmployee - IEmployee is an interface that is implemented by Employee
 * @see PartTimeEmployee - PartTimeEmployee is a class that extends Employee
 * @see FullTimeEmployee - FullTimeEmployee is a class that extends Employee
 */
public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static List<Employee> employees = new ArrayList<>();

    /**
     * Method menu() is used to display menu
     *
     * @author - Le_Van_Anh
     */
    public static void menu() {
        do {
            System.out.println("1. Add new employee");
            System.out.println("2. Show information of employees: Name, Payment per hour, Working hours, Salary");
            System.out.println("3. Sort employees by salary(descending)");
            System.out.println("4. Find employee work the most time");
            System.out.println("5. Delete employee the least working hours");
            System.out.println("6. Exit");

            System.out.print("Your choice: ");
            Byte choice = scanner.nextByte();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    String employee;

                    do {
                        System.out.printf("%3sPart Time or Full Time: ", " ");
                        employee = scanner.nextLine();
                    } while (!employee.equalsIgnoreCase("Part Time")
                            && !employee.equalsIgnoreCase("Full Time"));

                    if (employee.equalsIgnoreCase("Part Time")) {
                        System.out.printf("%5sEnter sum of employees: ", " ");
                        Integer sumOfEmployees = scanner.nextInt();
                        scanner.nextLine();

                        for (int i = 0; i < sumOfEmployees; i++) {
                            System.out.format("%7sEnter some information of employee %d:\n", " ", i + 1);

                            System.out.printf("%9sName: ", " ");
                            String name = scanner.nextLine();

                            System.out.format("%9sPayment per hour: ", " ");
                            Integer paymentPerHour = scanner.nextInt();

                            System.out.printf("%9sWorking hours: ", " ");
                            Integer workingHours = scanner.nextInt();
                            scanner.nextLine();

                            employees.add(new PartTimeEmployee(name, paymentPerHour, workingHours));
                        }
                    } else {
                        System.out.printf("%5sEnter sum of employees: ", " ");
                        Integer sumOfEmployees = scanner.nextInt();
                        scanner.nextLine();

                        for (int i = 0; i < sumOfEmployees; i++) {
                            System.out.format("%7sEnter some information of employee %d:\n", " ", i + 1);

                            System.out.printf("%9sName: ", " ");
                            String name = scanner.nextLine();

                            System.out.format("%9sPayment per hour: ", " ");
                            Integer paymentPerHour = scanner.nextInt();
                            scanner.nextLine();

                            employees.add(new FullTimeEmployee(name, paymentPerHour));
                        }
                    }
                    break;

                case 2:
                    System.out.printf("%-20s%-20s%-20s%s\n", "Numbers", "Name", "Salary Per Hour", "Working Hour");

                    Integer[] count = new Integer[1];

                    count[0] = 1;

                    employees.forEach(number -> {
                        System.out.printf("%-20d%-20s%-20s", count[0], number.getName(), number.getPaymentPerHour());

                        if (number instanceof PartTimeEmployee) {
                            System.out.printf("%s\n", ((PartTimeEmployee) number).getWorkingHours());
                        } else
                            System.out.printf("%d\n", 8);

                        count[0]++;
                    });

                    break;

                case 3:
//                    Collections.sort(employees, (e1, e2) -> {
//                        return e2.calculateSalary() - e1.calculateSalary();
//                    });

                    employees.sort((e1, e2) -> e2.calculateSalary() - e1.calculateSalary());

                    System.out.printf("%3sSort success, please choose number 2 to see the change !\n", " ");
                    break;

                case 4:
                    Integer[] count1 = new Integer[1];

                    count1[0] = 1;

                    Integer max = employees.stream().map(employee1 -> {
                        if (employee1 instanceof PartTimeEmployee) {
                            return ((PartTimeEmployee) employee1).getWorkingHours();
                        } else {
                            return 8;
                        }
                    }).max((e1, e2) -> {
                        return e1.compareTo(e2);
                    }).get();

                    List<String> workingMax = employees.stream().filter(employee1 -> {
                        if (employee1 instanceof PartTimeEmployee && ((PartTimeEmployee) employee1).getWorkingHours().equals(max)) {
                            return true;
                        }

                        if (employee1 instanceof FullTimeEmployee) {
                            return true;
                        } else {
                            return false;
                        }
                    }).map((employee1) -> {
                        if (employee1 instanceof PartTimeEmployee) {
                            return String.format("%-20d%-20s%-20s%s\n", count1[0]++, employee1.getName(),
                                    employee1.getPaymentPerHour(), ((PartTimeEmployee) employee1).getWorkingHours());
                        }

                        if (employee1 instanceof FullTimeEmployee) {
                            return String.format("%-20d%-20s%-20s%d\n", count1[0]++, employee1.getName(), employee1.getPaymentPerHour(), 8);
                        } else {
                            return "";
                        }
                    }).collect(Collectors.toList());

                    System.out.printf("%-20s%-20s%-20s%s\n", "Numbers", "Name", "Salary Per Hour", "Working Hour");
                    workingMax.forEach(employee1 -> {
                        System.out.print(employee1);
                    });
                    break;

                case 5:
                    Boolean check = true;

                    for (Employee employee1 : employees) {
                        if (employee1 instanceof PartTimeEmployee)
                            check = false;
                    }

                    if (check) {
                        System.out.println("All employees are full time employee");
                    } else {
                        Integer min = employees.stream().map(employee1 -> {
                            if (employee1 instanceof PartTimeEmployee) {
                                return ((PartTimeEmployee) employee1).getWorkingHours();
                            } else {
                                return 8;
                            }
                        }).min((employee1, employee2) -> employee1.compareTo(employee2)).get();


                        employees.removeIf(employee1 -> {
                            if (employee1 instanceof PartTimeEmployee) {
                                return ((PartTimeEmployee) employee1).getWorkingHours().equals(min);
                            } else {
                                return false;
                            }
                        });

                        System.out.println("Earse sucess !");
                    }

                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Your choose will be false, please enter again please !");
                    break;
            }

        } while (true);
    }
}
