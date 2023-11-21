package Bai_tap_buoi_5.Bai_1;

import java.util.Scanner;

public class Address {
    private String commune;
    private String district;
    private String city;

    public Address() {
    }

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tEnter address: ");

        System.out.print("\t\tCommune: ");
        String commune = scanner.nextLine();
        setCommune(commune);

        System.out.print("\t\tDistrict: ");
        String district = scanner.nextLine();
        setDistrict(district);

        System.out.print("\t\tCity: ");
        String city = scanner.nextLine();
        setCity(city);
    }

    public void output() {
        System.out.println("Commune: " + getCommune() + ", district: " + getDistrict() + ", city: " + getCity());
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10s%-10s",getCommune(), getDistrict(), getCity());
    }
}
