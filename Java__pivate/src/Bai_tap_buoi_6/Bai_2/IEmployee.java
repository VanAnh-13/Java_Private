package Bai_tap_buoi_6.Bai_2;

/**
 * Interface IEmployee is used to calculate salary of an employee
 * @see Employee - Employee is an abstract class that implements IEmployee
 * @see PartTimeEmployee - PartTimeEmployee is a class that extends Employee
 * @see FullTimeEmployee - FullTimeEmployee is a class that extends Employee
 * @author - Le_Van_Anh
 */
public interface IEmployee {
    Integer calculateSalary();
    String getName();
}
