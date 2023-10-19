package bai_tap_buoi_1;

import java.util.Scanner;
import java.util.Stack;

/**
 * <strong> Nội dung </strong> bài tập 2
 */
public class Bai_2 {

    /**
     * Phương thức <strong> trả về kí tự tương ứng </strong> cho phần dư
     */

    public static char KiTuDu(int phanDu) {
        if(phanDu < 10)
            return (char) ('0' + phanDu);
        else
            return (char) ('A' + (phanDu - 10));
    }

    /**
     * Phương thức <strong> chuyển đổi </strong> cơ số
     */
    public static void ChuyenDoiCoSo(int soCanChuyen, int heCanChuyen) {
        Stack<Character> stack = new Stack<>();

        int bienTam = soCanChuyen;

        while (bienTam > 0) {
            int bienTam1 = bienTam % heCanChuyen;
            stack.push(KiTuDu(bienTam1));
            bienTam /= heCanChuyen;
        }

        while (!stack.isEmpty())
            System.out.print(stack.pop());

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soCanChuyen, heCanChuyen;

        System.out.print("Nhập số cần chuyển: ");
        soCanChuyen = in.nextInt();

        System.out.print("Nhập hệ cần chuyển: ");
        heCanChuyen = in.nextInt();

        ChuyenDoiCoSo(soCanChuyen, heCanChuyen);

        in.close();
    }
}
