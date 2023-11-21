package Bai_tap_buoi_5.Bai_2;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Bill {
    private String sign;
    private String number;
    private String date;
    private Seller seller;
    private Buyer buyer;
    private List<Goods> goods;
    private Double totalPrice;

    public Bill() {
        this.sign = "";
        this.number = "";
        this.date = "";
        this.seller = new Seller();
        this.buyer = new Buyer();
        this.goods = new ArrayList<Goods>();
        this.totalPrice = 0.0;
    }

    public Bill(String sign, String number, String date, Seller seller, Buyer buyer, ArrayList<Goods> goods, Double totalPrice) {
        this.sign = sign;
        this.number = number;
        this.date = date;
        this.seller = seller;
        this.buyer = buyer;
        this.goods = goods;
        this.totalPrice = totalPrice;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }


    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sign: ");
        String sign = scanner.nextLine();
        setSign(sign);

        System.out.print("Enter number: ");
        String number = scanner.nextLine();
        setNumber(number);

        System.out.print("Enter date: ");
        String date = scanner.nextLine();
        setDate(date);

        System.out.println("Enter seller: ");
        Seller seller = new Seller();
        seller.input();
        setSeller(seller);

        System.out.println("Enter buyer: ");
        Buyer buyer = new Buyer();
        buyer.input();
        setBuyer(buyer);

        System.out.print("Enter number of goods: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter goods " + (i + 1) + ": ");
            Goods goods = new Goods();
            goods.input();
            this.goods.add(goods);
        }

        Double totalPrice = 0.0;
        for (Goods goods : this.goods) {
            totalPrice += goods.getPrice() * goods.getQuantity();
        }
        setTotalPrice(totalPrice);

    }

    public void output() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%70s\n", "HOA DON BAN HANG");
        System.out.printf("%80s\n%83s\n%61s\n", "Ky hieu: " + getSign(), "So hoa don: " + getNumber(), "Ngay: " + getDate());
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println(seller);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println(buyer);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        sortGoodsByPrice();
        System.out.printf("%-21s%-21s%-21s%-22s%-22s%s\n", "STT" , "Ten hang hoa", "Don vi tinh", "So luong", "Don gia", "Thanh tien");
        for(int i = 0; i < getGoods().size(); i++){
            System.out.printf("%-21d%-20s %-20s %-21d %-21.3f %.3f\n", (i + 1), getGoods().get(i).getName(), getGoods().get(i).getUnits(),
                    getGoods().get(i).getQuantity(), getGoods().get(i).getPrice(), getGoods().get(i).total());
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Tong tien: " + getTotalPrice());
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }

    public void sortGoodsByPrice() {
        for (int i = 0; i < goods.size() - 1; i++) {
            for (int j = i + 1; j < goods.size(); j++) {
                if (goods.get(i).getPrice() < goods.get(j).getPrice()) {
                    Goods temp = goods.get(i);
                    goods.set(i, goods.get(j));
                    goods.set(j, temp);
                }
            }
        }
    }
}
