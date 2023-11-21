package Bai_tap_buoi_5.Bai_1;

import java.util.Scanner;

public class Person {
    protected String name;
    protected Byte age;
    protected Address address;

    public Person() {
        Address address = new Address();
        this.address = address;
    }

    public Person(String name, Byte age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tEnter name and age: ");

        System.out.print("\t\tName: ");
        String name = scanner.nextLine();
        setName(name);

        System.out.print("\t\tAge: ");
        Byte age = scanner.nextByte();
        setAge(age);

        this.address.input();
    }

    void output(){
        System.out.print("Name: " + getName() + ", age: " + getAge() + getAddress());
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10s%-10s\n",getName(), getAge(), getAddress());
    }
}
