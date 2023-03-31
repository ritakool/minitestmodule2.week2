package ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double sum1;
        double sum2;
        double difference;
        ArrayList<Product> H = new ArrayList<>();
        Product h1 = new Product("DAM","Chân đầm",2,90,5);
        Product h2 = new Product("VA","Váy dài",500);
        Product h3 = new Product("VA","Váy ngắn",3,500,10);
        Product h4 = new Product("QA","Quần bò",400);
        Product h5 = new Product("QA","Quần âu",2,400,7);
        H.add(h1);
        H.add(h2);
        H.add(h3);
        H.add(h4);
        H.add(h5);
        sum1 = tienchuaKM(H);
        sum2 = tiencoKM(H);
        difference  = sum1 - sum2;
        System.out.println("tiền thanh toán là: " +sum2);
        System.out.println("tiền thanh toán chưa có KM là: " +sum1);
        System.out.println("tiền chênh lệch là: " + difference);
    }
    public static double tiencoKM(ArrayList<Product> arr) {
        double sum = 0;
        for (Product a : arr) {
            sum += a.bill2();
        }
        return sum;
    }
    public static double tienchuaKM(ArrayList<Product> arr) {
        double sum = 0;
        for (Product a : arr) {
            sum += a.bill1();
        }
        return sum;
    }
}
