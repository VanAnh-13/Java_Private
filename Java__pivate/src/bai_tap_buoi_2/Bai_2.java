package bai_tap_buoi_2;

import java.util.Scanner;

/**
 * <strong> Nội dung </strong> bài tập 2
 */

public class Bai_2 {

    /**
     * Hàm <strong> tính mảng cộng dồn </strong> và trả về giá trị tự vị trí left đến vị trí right
     */

    public static int PrefixSum(int[] a, int l, int r){
        int[] prefix = new int[a.length + 1];

        for(int i = 1; i <= a.length; i++)
            prefix[i] = prefix[i - 1] + a[i - 1];

        return prefix[r] - prefix[l - 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int number = in.nextInt();

        int[] arr = new int[number];

        for(int i = 0; i < number; i++)
            arr[i] = in.nextInt();

        System.out.print("Nhap so luong truy van: ");
        int q = in.nextInt();

        while(q > 0){
            int l = in.nextInt(), r = in.nextInt();
            System.out.println(PrefixSum(arr, l, r));
            q--;
        }
    }
}
