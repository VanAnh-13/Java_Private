package Bai_tap_buoi_5.Bai_2;

import java.util.Scanner;

public class Buyer {
    private String firstName;
    private String lastName;
    private String address;
    private String accountNumber;
    private String paymentMethod;
    private String taxCode;
    private String paymentCurrency;

    public Buyer() {
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.accountNumber = "";
        this.paymentMethod = "";
        this.taxCode = "";
        this.paymentCurrency = "";
    }

    public Buyer(String firstName, String lastName, String address, String accountNumber, String paymentMethod, String taxCode, String paymentCurrency) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.accountNumber = accountNumber;
        this.paymentMethod = paymentMethod;
        this.taxCode = taxCode;
        this.paymentCurrency = paymentCurrency;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\tThe first name of buyer: ");
        String firstName = scanner.nextLine();
        setFirstName(firstName);

        System.out.print("\tThe last name of buyer: ");
        String lastName = scanner.nextLine();
        setLastName(lastName);

        System.out.print("\tThe address of buyer: ");
        String address = scanner.nextLine();
        setAddress(address);

        System.out.print("\tThe account number of buyer: ");
        String accountNumber = scanner.nextLine();
        setAccountNumber(accountNumber);

        System.out.print("\tThe payment method of buyer: ");
        String paymentMethod = scanner.nextLine();
        setPaymentMethod(paymentMethod);

        System.out.print("\tThe tax code of buyer: ");
        String taxCode = scanner.nextLine();
        setTaxCode(taxCode);

        System.out.print("\tThe payment currency of buyer: ");
        String paymentCurrency = scanner.nextLine();
        setPaymentCurrency(paymentCurrency);

    }

    @Override
    public String toString() {
        return "First name of buyer: " + getFirstName() + "\n"
                + "Last name of buyer: " + getLastName() + "\n"
                + "Address of buyer: " + getAddress() + "\t\t\t\t\t\t"
                + "Account number of buyer: " + getAccountNumber() + "\n"
                + "Payment method of buyer: " + getPaymentMethod() + "\t\t\t"
                + "Tax code of buyer: " + getTaxCode() + "\t\t\t"
                + "Payment currency of buyer: " + getPaymentCurrency() + "\n";
    }
}
