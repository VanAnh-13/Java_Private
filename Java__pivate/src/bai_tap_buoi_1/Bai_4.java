package bai_tap_buoi_1;

import java.util.Scanner;

/**
 * <strong> Nội dung </strong> bài tập 4
 */

public class Bai_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhập số đầu tiên: ");
        int number = in.nextInt();

        System.out.print("Nhập số thứ 2: ");
        int number1 = in.nextInt();

        System.out.println("Tổng: " + (number + number1));
        System.out.println("Hiệu: " + (number - number1));
        System.out.println("Tích: " + (number * number1));
        System.out.println("Thương: " + (number / number1));

        in.close();
    }
}
