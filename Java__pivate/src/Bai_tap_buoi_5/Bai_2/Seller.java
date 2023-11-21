package Bai_tap_buoi_5.Bai_2;

import java.util.Scanner;

public class Seller {
    private String name;
    private String taxCode;
    private String address;
    private String accountNumber;
    private String phoneNumber;

    public Seller() {
        this.name = "";
        this.taxCode = "";
        this.address = "";
        this.accountNumber = "";
        this.phoneNumber = "";
    }

    public Seller(String name, String taxCode, String address, String accountNumber, String phoneNumber) {
        this.name = name;
        this.taxCode = taxCode;
        this.address = address;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\tThe name of seller: ");
        String name = scanner.nextLine();
        setName(name);

        System.out.print("\tThe tax code of seller: ");
        String taxCode = scanner.nextLine();
        setTaxCode(taxCode);

        System.out.print("\tThe address of seller: ");
        String address = scanner.nextLine();
        setAddress(address);

        System.out.print("\tThe account number of seller: ");
        String accountNumber = scanner.nextLine();
        setAccountNumber(accountNumber);

        System.out.print("\tThe phone number of seller: ");
        String phoneNumber = scanner.nextLine();
        setPhoneNumber(phoneNumber);
    }

    @Override
    public String toString() {
        return "Name of the seller: " + getName() + "\n"
                + "Tax code of the seller: " + getTaxCode() + "\n"
                + "Address of the seller: " + getAddress() + "\n"
                + "Account number of the seller: " + getAccountNumber() + "\n"
                + "Phone number of the seller: " + getPhoneNumber() + "\n";
    }
}
