/**
 * Packet lưu <strong> bài tập </strong> buổi 1
 */

package bai_tap_buoi_1;

import java.util.Scanner;

/**
 * <strong> Nội dung </strong> bài tập 1
 */

public class Bai_1 {
    /**
     * Phương <strong> tìm </strong> ước chung lớn nhất của <strong> 2 số </strong>
     */
    public static int Ucln(int number1, int number2) {
        while (number1 * number2 != 0) {
            if (number1 > number2)
                number1 %= number2;
            else
                number2 %= number1;
        }

        return number1 + number2;
    }

    /**
     * Phương thức <strong> tìm và in ra </strong> ước chung lớn nhất, bội chung nhỏ nhất của <strong> 3 số </strong>
     */

    public static void UCLN(int number, int number1, int number2) {
        int UCLN1 = Ucln(number, number1);
        int BCNN1 = number * number1 / UCLN1;
        System.out.println("Bội chung nhỏ nhất 3 số là : " + BCNN1 * number2 / Ucln(BCNN1, number2));
        System.out.println("Ước chung lớn nhất 3 số là :  " + Ucln(UCLN1, number2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number, number1, number2;

        System.out.print("Nhập số a = ");
        number = in.nextInt();

        System.out.print("Nhập số b = ");
        number1 = in.nextInt();

        System.out.print("Nhập số c = ");
        number2 = in.nextInt();

        UCLN(number, number1, number2);

        in.close();
    }
}
