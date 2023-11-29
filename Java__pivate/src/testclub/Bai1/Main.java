package testclub.Bai1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        int count = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;

        System.out.print("Nhap chuoi ngoac ban muon kiem tra:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (char i : stack) {
            switch (i) {
                case '(':
                    count++;
                    break;
                case ')':
                    count2++;
                    break;
                case '[':
                    count3++;
                    break;
                case ']':
                    count4++;
                    break;

                case '{':
                    count5++;
                    break;

                case '}':
                    count6++;
                    break;
            }
        }
        if ((count2 > count) || (count4 > count3) || (count6 > count5) || (count2 < count) || (count4 < count3) || (count6 < count5)) {
            System.out.println("False");
        } else if (count2 == count && count4 == count3 && count6 == count5) {
            System.out.println("True");
            System.out.println("(): " + (count2 + count) / 2);
            System.out.println("[]: " + (count4 + count3) / 2);
            System.out.println("{}: " + (count6 + count5) / 2);
        }
    }
}
