package bai_tap_buoi_4;

import java.util.Scanner;

public class Manage {
    public static final String MAQL = "0";
    public static final String TENQL = "No name";

    private String maQL;
    private String tenQL;

    public Manage() {
        this(Manage.MAQL, Manage.TENQL);
    }

    public Manage(String maQL, String tenQL) {
        this.maQL = maQL;
        this.tenQL = tenQL;
    }

    public String getMaQL() {
        return maQL;
    }

    public String getTenQL() {
        return tenQL;
    }

    public Manage setMaQL(String maQL) {
        this.maQL = maQL;
        return this;
    }

    public Manage setTenQL(String tenQL) {
        this.tenQL = tenQL;
        return this;
    }

    public void nhap(){
        Scanner in = new Scanner(System.in);

        System.out.print("  Id of manage: ");
        String maQL = in.nextLine();
        this.setMaQL(maQL);

        System.out.print("  Name of manage: ");
        String tenQL = in.nextLine();
        this.setTenQL(tenQL);
    }

    public void xuat(){
        System.out.println("- Id of manage: " + this.getMaQL() + ", name of manage: " + this.getTenQL());
    }
}
