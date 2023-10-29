package bai_tap_buoi_2;

import java.util.Scanner;

/**
 * <strong> Nội dung </strong> bài tập 3
 */
public class Bai_3 {

    /**
     *  Hàm <strong> đếm và in ra </strong> số lượng các chữ số, kí tự đặc biệt và chữ cái
     */

    public static void SoLuong(String chuoi){
        int count1 = 0, count2 = 0, count3 = 0;

        for(int i = 0; i < chuoi.length(); i++){
            char c = chuoi.charAt(i);

            if(Character.isAlphabetic(c))
                count1++;

            else if(Character.isDigit(c))
                count2++;

            else
                count3++;
        }

        System.out.println("Chu cai: " + count1 + ", so: " + count2 + ", ki tu dac biet: " + count3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap chuoi can kiem tra: ");
        String chuoi = in.nextLine();

        SoLuong(chuoi);

        in.close();
    }
}
