package bai_tap_buoi_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerRoom {
    private String maPhong;
    private String tenPhong;
    private Manage manage;
    private List<Computer> computers;
    private Integer sumOfComputers;

    public ComputerRoom() {
        Manage manage = new Manage();
        this.manage = manage;

        List<Computer> computers = new ArrayList<>();
        this.computers = computers;
    }

    public ComputerRoom(String maPhong, String tenPhong, Manage manage, List<Computer> computers, Integer sumOfComputers) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.manage = manage;
        this.computers = computers;
        this.sumOfComputers = sumOfComputers;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public Manage getManage() {
        return manage;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public Integer getSumOfComputers() {
        return sumOfComputers;
    }

    public ComputerRoom setMaPhong(String maPhong) {
        this.maPhong = maPhong;
        return this;
    }

    public ComputerRoom setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
        return this;
    }

    public ComputerRoom setManage(Manage manage) {
        this.manage = manage;
        return this;
    }

    public ComputerRoom setComputers(List<Computer> computers) {
        this.computers = computers;
        return this;
    }

    public ComputerRoom setSumOfComputers(Integer sumOfComputers) {
        this.sumOfComputers = sumOfComputers;
        return this;
    }

    public void nhap(){
        Scanner in = new Scanner(System.in);

        System.out.print("  Id of computer room: ");
        String maPhong = in.nextLine();
        this.setMaPhong(maPhong);

        System.out.print("  Name of computer room: ");
        String tenPhong = in.nextLine();
        this.setTenPhong(tenPhong);

        this.manage.nhap();

        System.out.print("  Sum of computers: ");
        Integer sumOfComputers = in.nextInt();
        this.setSumOfComputers(sumOfComputers);

        for(int i = 0; i < this.getSumOfComputers(); i++){
            System.out.println("Enter some information of computer " + (i + 1) + ":");
            Computer computer = new Computer();
            computer.nhap();
            this.computers.add(computer);
        }
    }

    public void xuat(){
        System.out.println("- Id of computer room: " + getMaPhong()
                + ", name of computer room: " + getTenPhong() + ", sum of computers: " + getSumOfComputers());
        this.manage.xuat();

        for(int i = 0; i < this.getSumOfComputers(); i++){
            System.out.println("    This is some information about computer " + (i + 1) + ":");
            this.computers.get(i).xuat();
        }
    }

    public void findComputer(String kieuMay){
        Integer count = 0;

        for(int i = 0; i < computers.size(); i++){
            if(computers.get(i).getKieuMay().equals(kieuMay)){
                computers.get(i).xuat();
                count++;
            }
        }

        if(count.equals(0)){
            System.out.println("No computer have this mode! ");
        }
    }

    public void findComputer(Integer maMay){
        Integer count = 0;

        for(int i = 0; i < computers.size(); i++){
            if(computers.get(i).getMaMay().equals(maMay)){
                computers.get(i).xuat();
                count++;
            }
        }

        if(count.equals(0)){
            System.out.println("No computer have this id! ");
        }
    }
}
