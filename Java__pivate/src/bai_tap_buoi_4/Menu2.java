package bai_tap_buoi_4;

import java.util.Scanner;

public class Menu2 {
    static Scanner in = new Scanner(System.in);

    public static void menu(){
        Byte choose;
        ComputerRoom computerRoom = new ComputerRoom();

        while(true){
            System.out.print("Enter your choose: ");
            choose = in.nextByte();

            switch (choose){
                case 1:
                    System.out.println("- Enter some information about 1 computer room: ");
                    computerRoom.nhap();
                    break;

                case 2:
                    System.out.println("There are some information about this computer room: ");
                    computerRoom.xuat();
                    break;

                case 3:
                    System.out.print("- Enter computer mode you want to find: ");
                    in.nextLine();
                    String kieuMay = in.nextLine();

                    System.out.println("- There are some information about computer you want: ");
                    computerRoom.findComputer(kieuMay);
                    break;

                case 4:
                    System.out.print("- Enter id computer you want to find: ");
                    Integer maMay = in.nextInt();

                    System.out.println("- There are some information about computer you want: ");
                    computerRoom.findComputer(maMay);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Your choose is false, please change your choose now! ");
                    break;
            }
        }
    }
}
