package bai_tap_buoi_3;

import java.util.Scanner;

public class Vegetable {
    private String id;
    private String name;
    private String unit;
    private int quantitySold;
    private int sale;
    private double price;

    public Vegetable() {
        Scanner in = new Scanner(System.in);

        System.out.print("Id: ");
        this.id = in.nextLine();

        System.out.print("Name: ");
        this.name = in.nextLine();

        System.out.print("Unit: ");
        this.unit = in.nextLine();

        System.out.print("Quantity Sold: ");
        this.quantitySold = in.nextInt();

        System.out.print("Sale: ");
        this.sale = in.nextInt();

        System.out.print("Price: ");
        this.price = in.nextDouble();

    }

    public Vegetable(String id, String name, String unit, int quantitySold, int sale, double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.quantitySold = quantitySold;
        this.sale = sale;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalRevenue() {
        double Price = getPrice() - getSale();
        return getQuantitySold() * Price;
    }

    public void display() {
        System.out.printf("%-10s%-20s%-10s%-20d%-10d%-15.3f%.3f\n",
                getId(), getName(), getUnit(), getQuantitySold(), getSale(), getPrice(), getTotalRevenue());
    }
}