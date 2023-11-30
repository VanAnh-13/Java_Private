package Bai_tap_buoi_6.Bai_2;

/**
 * Class FullTimeEmployee is used to calculate salary of a full-time employee
 * @see Employee - Employee is an abstract class that implements IEmployee
 * @see IEmployee - IEmployee is an interface that is implemented by Employee
 * @see PartTimeEmployee - PartTimeEmployee is a class that extends Employee
 * @author - Le_Van_Anh
 */
public class FullTimeEmployee extends Employee{
    // Constructor
    public FullTimeEmployee(String name, Integer paymentPerHour) {
        super(name, paymentPerHour);
    }

    // Other method
    /**
     * Method calculateSalary() is used to calculate salary of a full-time employee
     * @return - The salary of a full-time employee
     * @see Employee#calculateSalary() - Employee#calculateSalary() is a method that is overridden by FullTimeEmployee#calculateSalary()
     * @author - Le_Van_Anh
     */
    @Override
    public Integer calculateSalary() {
        return 8 * getPaymentPerHour();
    }
}
