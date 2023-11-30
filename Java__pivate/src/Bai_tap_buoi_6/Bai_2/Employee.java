package Bai_tap_buoi_6.Bai_2;

/**
 * Abstract class Employee is used to calculate salary of an employee
 * @see IEmployee - IEmployee is an interface that is implemented by Employee
 * @see PartTimeEmployee - PartTimeEmployee is a class that extends Employee
 * @see FullTimeEmployee - FullTimeEmployee is a class that extends Employee
 * @author - Le_Van_Anh
 */
public abstract class Employee implements IEmployee {
    // Object attributes
    private String name;
    private Integer paymentPerHour;

    // Constructor
    public Employee(String name, Integer paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    // Getter and Setter
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(Integer paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}
