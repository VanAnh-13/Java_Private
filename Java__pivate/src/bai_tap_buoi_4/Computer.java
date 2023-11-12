package bai_tap_buoi_4;

import java.util.Scanner;

public class Computer {
    public static final Integer MAMAY = 0;
    public static final String KIEUMAY = "No machine mode";
    public static final String TINHTRANG = "No status";

    private Integer maMay;
    private String kieuMay;
    private String tinhTrang;

    public Computer() {
        this(Computer.MAMAY, Computer.KIEUMAY, Computer.TINHTRANG);
    }

    public Computer(Integer maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public Integer getMaMay() {
        return this.maMay;
    }

    public String getKieuMay() {
        return this.kieuMay;
    }

    public String getTinhTrang() {
        return this.tinhTrang;
    }

    public Computer setMaMay(Integer maMay) {
        this.maMay = maMay;
        return this;
    }

    public Computer setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
        return this;
    }

    public Computer setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
        return this;
    }

    public void nhap(){
        Scanner in = new Scanner(System.in);

        System.out.print("  Id of computer: ");
        Integer maMay = in.nextInt();
        this.setMaMay(maMay);
        in.nextLine();

        System.out.print("  Machine mode of computer: ");
        String kieuMay = in.nextLine();
        this.setKieuMay(kieuMay);

        System.out.print("  Status of computer: ");
        String tinhTrang = in.nextLine();
        this.setTinhTrang(tinhTrang);
    }

    public void xuat(){
        System.out.println("        + Id of computer: " + getMaMay()
                + ", machine mode of computer: " + getKieuMay() + ", status of computer: " + getTinhTrang());
    }
}
