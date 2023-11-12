package bai_tap_buoi_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Menu1 {
    static Scanner in = new Scanner(System.in);

    public static void menu() {
        Byte choose = 0;
        List<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.print("Enter your choose: ");
            choose = in.nextByte();

            switch (choose) {

                case 1:
                    System.out.print("Enter the total book: ");
                    Integer lengthBook = in.nextInt();

                    for (int i = 0; i < lengthBook; i++) {
                        System.out.println("Enter some information about this book " + (i + 1) + ":");
                        Book book = new Book();
                        book.input();
                        bookList.add(book);
                    }

                    break;

                case 2:
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println("Information about book " + (i + 1) + ":");
                        bookList.get(i).output();
                    }
                    break;

                case 3:
                    System.out.print("Enter name book you want to find: ");
                    in.nextLine();
                    String findName = in.nextLine();

                    for (int i = 0; i < bookList.size(); i++) {
                        if (findName.equals(bookList.get(i).getTenSach())) {
                            System.out.println("This information is the book you want: ");
                            bookList.get(i).output();
                        }
                    }

                    break;

                case 4:
                    Set<String> set = new TreeSet<>();

                    for (int i = 0; i < bookList.size(); i++) {
                        set.add(bookList.get(i).getAuthor().getTenTacGia());
                    }

                    for (String author : set) {
                        for (int i = 0; i < bookList.size(); i++) {
                            if (bookList.get(i).getAuthor().getTenTacGia().equals(author)){
                                bookList.get(i).output();
                            }
                        }
                    }

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
