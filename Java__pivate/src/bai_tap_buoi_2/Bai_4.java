package bai_tap_buoi_2;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * <Strong> Nội dung </Strong> bài tập 4
 */
public class Bai_4 {

    /**
     * Hàm <Strong> kiểm tra </Strong> xem có phải chuỗi Pangram
     */

    public static void CheckPangram(String chuoi) {
        String chuoi1 = chuoi.toLowerCase();
        Map<Character, Integer> map = new TreeMap<>();

        for (char v = 'a'; v <= 'z'; v++)
            map.put(v, 0);

        for (int v = 0; v < chuoi1.length(); v++)
            map.put(chuoi1.charAt(v), map.get(chuoi1.charAt(v)) + 1);

        int count = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet())
            if (entry.getValue() == 0)
                count++;

        if (count != 0)
            System.out.println("NO");

        else
            System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap chuoi can kiem tra: ");
        String chuoi = in.nextLine();

        CheckPangram(chuoi);

        in.close();
    }
}
