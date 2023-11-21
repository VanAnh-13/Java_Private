package Bai_tap_buoi_5.Bai_1;

import java.util.Scanner;

public class Student extends Person{
    private final Float CRITRIA = 2f;

    private Integer id;
    private String nameClass;
    private Float gpa;

    public Student() {
        super();
    }

    public Student(String name, Byte age, Address address, Integer id, String nameClass, Float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public Float getCRITRIA() {
        return CRITRIA;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    @Override
    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("\t\tId: ");
        Integer id = scanner.nextInt();
        this.setId(id);
        scanner.nextLine();

        if (id.equals(555)){
            return;
        }

        System.out.print("\t\tClass name: ");
        String nameClass = scanner.nextLine();
        this.setNameClass(nameClass);

        System.out.print("\t\tGpa: ");
        Float gpa = scanner.nextFloat();
        this.setGpa(gpa);

        super.input();
    }

    @Override
    void output() {
        System.out.printf("%-17s%-23s%-18s%-26s%-26s%-21s%-19s%s\n", getId(), getName(),
                getAge(), getAddress().getCommune(), getAddress().getDistrict(), getAddress().getCity(), getNameClass(), getGpa());
    }

    public void checkFall(){
        if (getGpa() >= getCRITRIA()) {
            System.out.println("Student is good!");
        } else {
            System.out.println("Student is fail a grade!");
        }
    }
}
