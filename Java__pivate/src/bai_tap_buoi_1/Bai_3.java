package bai_tap_buoi_1;

import java.util.Scanner;

/**
 * <strong> Nội dung </strong> bài tập 3
 */

public class Bai_3 {

    /**
     * Phương thức <strong> tính và in ra </strong> tích số bất kì
     */

    public static void TichCacSo(int number){
        int multiplication = 1;

        while(number > 0){
            multiplication *= number % 10;
            number /= 10;
        }

        System.out.println("Tích các chữ số của số đó là: " + multiplication);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        System.out.print("Nhập số cần tính tích: ");
        number = in.nextInt();

        TichCacSo(number);

        in.close();
    }
}
