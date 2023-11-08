package bai_tap_buoi_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainSubject {

    public static void out(List<Subject> subject){
        System.out.printf("%-8s%-20s%-20s%s\n", "Id", "Subject name", "Student count", "Time start - end");

        for(int i = 0; i < subject.size(); i++)
            subject.get(i).display();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte selection = 0;
        List<Subject> subject = new ArrayList<>();

        while (selection < 6) {
            System.out.print("----------Nhap lua chon: ");
            selection = in.nextByte();

            switch (selection) {
                case 1:
                    System.out.println("Nhap 1 tiet hoc moi: ");
                    Subject subject1 = new Subject();
                    subject.add(subject1);
                    in.nextLine();

                    while (true) {
                        System.out.print("Continue input(y\\n): ");
                        String continue1 = in.nextLine();

                        if (continue1.equals("y")) {
                            System.out.println("Nhap 1 tiet hoc moi: ");
                            Subject subject2 = new Subject();
                            subject.add(subject2);
                        } else
                            break;
                    }

                    break;

                case 2:
                    out(subject);
                    break;

                case 3:
                    Collections.sort(subject);

                    System.out.println("Sau khi sap xep la: ");
                    out(subject);
                    break;

                case 4:
                    int maxNumberOfSubjects = 1;
                    for (int i = 0; i < subject.size(); i++) {
                        if (subject.get(i).getTimeStart().compareTo(subject.get(i - 1).getTimeEnd()) >= 0) {
                            maxNumberOfSubjects++;
                        }
                    }

                    System.out.println("Sinh vien co the hoc toi da " + maxNumberOfSubjects + " mon hoc trong khoang thoi gian nay");
                    if (maxNumberOfSubjects > 0) {
                        System.out.println("Danh sach cac mon hoc co the hoc:");
                       out(subject);
                    }

                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ban da nhap sai!");
                    break;
            }
        }
    }
}