package Bai_tap_buoi_5.Bai_2;

import java.util.Scanner;

public class Goods {
    private String name;
    private String units;
    private Integer quantity;
    private Double price;

    public Goods() {
        this.name = "";
        this.units = "";
        this.quantity = 0;
        this.price = 0.0;
    }

    public Goods(String name, String units, Integer quantity, Double price) {
        this.name = name;
        this.units = units;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\tEnter name goods: ");
        String name = scanner.nextLine();
        setName(name);

        System.out.print("\tEnter units goods: ");
        String units = scanner.nextLine();
        setUnits(units);

        System.out.print("\tEnter quantity goods: ");
        Integer quantity = scanner.nextInt();
        setQuantity(quantity);

        System.out.print("\tEnter price goods: ");
        Double price = scanner.nextDouble();
        setPrice(price);
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20d %-20.3f %.3f", getName(), getUnits(), getQuantity(), getPrice(), total());
    }

    public Double total() {
        return getPrice() * getQuantity();
    }
}
