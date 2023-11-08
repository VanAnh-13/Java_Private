package bai_tap_buoi_3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class MainVegetable {

    public static void Out(Vector<Vegetable> Veget) {
        System.out.printf("%-10s%-20s%-10s%-20s%-10s%-15s%s\n",
                "Id", "Name", "Unit", "Quantity sold", "Sale", "Price", "Revenue");
        for (int i = 0; i < Veget.size(); i++)
            Veget.get(i).display();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector<Vegetable> Veget = new Vector<>();
        byte selection = 0;

        while (selection <= 6) {
            System.out.print("--------------Nhap lua chon: ");
            selection = in.nextByte();

            switch (selection) {
                case 1:
                    System.out.println("Nhap loai rau moi: ");
                    Vegetable vegetable = new Vegetable();
                    Veget.add(vegetable);
                    in.nextLine();

                    while (true) {
                        System.out.print("Continue Input(Y\\N): ");
                        String check = in.nextLine();

                        if (check.equals("Y")) {
                            System.out.println("Nhap loai rau moi: ");
                            Vegetable vegetable1 = new Vegetable();
                            Veget.add(vegetable1);
                        } else
                            break;
                    }

                    break;

                case 2:
                    Out(Veget);
                    break;

                case 3:
                    for (int i = 0; i < Veget.size() - 1; i++) {
                        int max = i;

                        for (int j = i + 1; j < Veget.size(); j++)
                            if (Veget.get(j).getTotalRevenue() < Veget.get(max).getTotalRevenue())
                                max = j;

                        if (max != i)
                            Collections.swap(Veget, max, i);
                    }

                    System.out.println("Mang sau khi sap xep la: ");
                    Out(Veget);

                    break;

                case 4:
                    // a
                    Veget.sort(new VegetableComparator());

                    System.out.println("Cac loai rau cung don vi sau khi duoc sap xep la: ");
                    Out(Veget);

                    // b
                    Veget.sort(new VegetablePriceComparator());

                    System.out.println("Cac loai rau cung don vi sau khi duoc sap xep tang dan theo gia la: ");
                    Out(Veget);
                    break;

                case 5:
                    Vector<Vegetable> vector = new Vector<>();

                    System.out.print("Nhap ten can tim kiem: ");
                    in.nextLine();
                    String search = in.nextLine();

                    for (int i = 0; i < Veget.size(); i++)
                        if (search.equals(Veget.get(i).getName()))
                            vector.add(Veget.get(i));

                    System.out.println("Cac loai rau cu co cung ten la: ");
                    Out(vector);
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ban da nhap sai!");
                    break;
            }
        }
    }
}

class VegetableComparator implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return o1.getUnit().compareTo(o2.getUnit());
    }
}

class VegetablePriceComparator implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        int compare1 = o1.getUnit().compareTo(o2.getUnit());

        if (compare1 != 0)
            return compare1;

        else
            return Double.compare(o1.getPrice(), o2.getPrice());
    }
}