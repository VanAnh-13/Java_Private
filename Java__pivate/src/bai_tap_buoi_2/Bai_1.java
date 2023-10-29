/**
 * Package lưu <strong> nội dung bài tập buổi 2 </strong>
 */

package bai_tap_buoi_2;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <strong> Nội dung </strong> bài tập 1
 */

public class Bai_1 {
    /**
     * Hàm <strong> tìm và in ra </strong> phần tử xuất hiện nhiều nhất trong mảng
     */

    public static void PhanTuNhieuNhat(Integer[] arr, Integer number) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < number; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);

            else
                map.put(arr[i], 1);
        }

        Integer phanTu = 0;
        Integer max = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (entry.getValue() > max && entry.getKey() > phanTu) {
                max = entry.getValue();
                phanTu = entry.getKey();
            }

        System.out.println("Phan tu xuat hien nhieu nhat trong mang la: " + phanTu
                + ", xuat hien: " + map.get(phanTu) + " lan.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        Integer number = in.nextInt();

        Integer[] arr = new Integer[number];

        for (Integer i = 0; i < number; i++)
            arr[i] = in.nextInt();

        PhanTuNhieuNhat(arr, number);

        in.close();
    }

}
