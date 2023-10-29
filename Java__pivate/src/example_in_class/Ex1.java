package example_in_class;

import java.util.Scanner;

public class Ex1 {
    private int a;
    private int b;

    public Ex1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Ex1() {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        this.a = in.nextInt();

        System.out.print("Nhập số b: ");
        this.b = in.nextInt();

        in.close();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int Ucln(){
        int tam1 = this.getA(), tam2 = this.getB();

        while (tam1 * tam2 != 0)
        {
            if(tam1 > tam2)
                tam1 %= tam2;
            else
                tam2 %= tam1;
        }

        return tam1 + tam2;
    }
}
