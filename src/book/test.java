package book;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        byte choice = -1;
        Scanner sc = new Scanner(System.in);
        listBook book = new listBook();
        while ( choice != 0 ) {
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Thêm sách ProgrammingBook: ");
            System.out.println("2. Thêm sách FictionBook: ");
            System.out.println("3. Tổng tiền: ");
            System.out.println("4. Đếm sách FictionBook có category Viễn tưởng 1: ");
            System.out.println("5. Đếm sách có giá nhỏ hơn 100: ");
            System.out.println("6. In danh sách: ");
            System.out.println("0. Exit ");
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    System.out.println(" Thêm sách ProgrammingBook: ");
                    sc.nextLine();
                    System.out.println("Mã sách: ");
                    String code = sc.nextLine();
                    System.out.println("Tên sách: ");
                    String name = sc.nextLine();
                    System.out.println("Tác giả: ");
                    String tg = sc.nextLine();
                    System.out.println("Ngôn ngữ: ");
                    String nn = sc.nextLine();
                    System.out.println("Framework: ");
                    String Fw = sc.nextLine();
                    System.out.println("Giá: ");
                    double price = sc.nextDouble();
                    Book pBook = new ProgrammingBook(code, name, tg, nn, Fw, price);
                    book.inputBook(pBook);
                    break;
                case 2:
                    System.out.println("Thêm sách FictionBook: ");
                    sc.nextLine();
                    System.out.println("Mã sách: ");
                    String code2 = sc.nextLine();
                    System.out.println("Tên sách: ");
                    String name2 = sc.nextLine();
                    System.out.println("Tác giả: ");
                    String tg2 = sc.nextLine();
                    System.out.println("Category: ");
                    String ct = sc.nextLine();
                    System.out.println("Giá: ");
                    double price2 = sc.nextDouble();
                    Book fBook = new FictionBook(code2, name2, tg2, ct, price2);
                    book.inputBook(fBook);
                    break;
                case 3:
                    System.out.println("Tổng tiền: ");
                    book.totalPrice();
                    break;
                case 4:
                    System.out.println("Đếm sách FictionBook có category Viễn tưởng 1: ");
                    System.out.print("Số sách là: ");
                    book.CategoryVT1();
                    break;
                case 5:
                    System.out.println("Đếm sách có giá nhỏ hơn 100: ");
                    System.out.print("Số sách là: ");
                    book.PriceLess100();
                    break;
                case 6:
                    book.outputBook();
                    break;
            }
        }

    }

}
