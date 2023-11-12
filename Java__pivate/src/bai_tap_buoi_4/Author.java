package bai_tap_buoi_4;

import java.util.Scanner;

public class Author {
    public static final String TENTACGIA = "No Name";
    public static final Short NAMSINH = 0;

    private String tenTacGia;
    private Short namSinh;

    public Author() {
        this(Author.TENTACGIA, Author.NAMSINH);
    }

    public Author(String tenTacGia, Short namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    public String getTenTacGia() {
        return this.tenTacGia;
    }

    public short getNamSinh() {
        return this.namSinh;
    }

    public Author setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
        return this;
    }

    public Author setNamSinh(Short namSinh) {
        this.namSinh = namSinh;
        return this;
    }

    public void input(){
        Scanner in = new Scanner(System.in);

        System.out.print("  Name of author: ");
        String tenTacGia = in.nextLine();
        this.setTenTacGia(tenTacGia);

        System.out.print("  Year of birth: ");
        Short namSinh = in.nextShort();
        this.setNamSinh(namSinh);
    }

    public String output(){
        return (", name of author: " + getTenTacGia() + ", Year of birth: " + getNamSinh());
    }
}
