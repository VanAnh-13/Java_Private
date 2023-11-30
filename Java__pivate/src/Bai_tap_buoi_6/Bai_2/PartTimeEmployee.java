package Bai_tap_buoi_6.Bai_2;

/**
 * Class PartTimeEmployee is used to calculate salary of a part-time employee
 * @see Employee - Employee is an abstract class that implements IEmployee
 * @see IEmployee - IEmployee is an interface that is implemented by Employee
 * @see FullTimeEmployee - FullTimeEmployee is a class that extends Employee
 * @author - Le_Van_Anh
 */
public class PartTimeEmployee extends Employee{
    // Object properties
    private Integer workingHours;

    // Constructor
    public PartTimeEmployee(String name, Integer paymentPerHour, Integer workingHours){
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    // Setter and Getter

    public Integer getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Integer workingHours) {
        this.workingHours = workingHours;
    }


    // Other method
    /**
     * Method calculateSalary() is used to calculate salary of a part-time employee
     * @return - The salary of a part-time employee
     * @see Employee#calculateSalary() - Employee#calculateSalary() is a method that is overridden by PartTimeEmployee#calculateSalary()
     * @author - Le_Van_Anh
     */
    @Override
    public Integer calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
}
