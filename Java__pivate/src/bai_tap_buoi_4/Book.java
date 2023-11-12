package bai_tap_buoi_4;

import java.util.Scanner;

public class Book {
    public static final String TENSACH = "No name";
    public static final Short NAMXUATBAN = 0;
    public static final String THELOAI = "No category";

    private static Integer id = 0;
    private Integer idBook;
    private String tenSach;
    private short namXuatBan;
    private String theLoai;
    Author author;

    public Book() {
        Author author = new Author();
        this.author = author;
    }

    public Book(String tenSach, Short namXuatBan, String theLoai, Author author) {
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.author = author;
        this.idBook = id;
    }

    public static Integer getId() {
        return id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public Short getNamXuatBan() {
        return namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public static void setId(int id) {
        Book.id = id;
    }

    public Book setTenSach(String tenSach) {
        this.tenSach = tenSach;
        return this;
    }

    public Book setNamXuatBan(short namXuatBan) {
        this.namXuatBan = namXuatBan;
        return this;
    }

    public Book setTheLoai(String theLoai) {
        this.theLoai = theLoai;
        return this;
    }

    public Book setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public Book setIdBook(Integer idBook){
        this.idBook = idBook;
        return this;
    }

    public void input() {
        Scanner in = new Scanner(System.in);

        Book.id++;
        this.setIdBook(id);

        System.out.print("  Name of book: ");
        String tenSach = in.nextLine();
        this.setTenSach(tenSach);

        System.out.print("  Year published: ");
        Short namXuatBan = in.nextShort();
        this.setNamXuatBan(namXuatBan);
        in.nextLine();

        System.out.print("  Category: ");
        String theLoai = in.nextLine();
        this.setTheLoai(theLoai);

        this.author.input();
    }

    public void output() {
        System.out.println("Id: " + getIdBook() + ", Name of book: "
                + getTenSach() + ", year published: " + getNamXuatBan() + ", category: " + getTheLoai() + this.author.output());
    }
}
