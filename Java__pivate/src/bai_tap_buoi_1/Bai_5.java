package bai_tap_buoi_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <strong> Nội dung </strong> bài tập 5
 */

public class Bai_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[5];

        for(int i = 0; i < 5; i++)
            a[i] = in.nextInt();

        Arrays.sort(a);

        System.out.println("Phần tử lớn nhất của mảng là: " + a[4]);
        System.out.println("Phần tử lớn thứ hai của mảng là: " + a[3]);

        in.close();
    }
}
