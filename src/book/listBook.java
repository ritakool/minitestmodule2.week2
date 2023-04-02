package book;

import java.util.ArrayList;

public class listBook {
    private ArrayList<Book> bookList;
    public listBook() {
        this.bookList = new ArrayList<>();
    }
    public listBook(ArrayList<Book> list) {
        this.bookList = list;
    }
    public void inputBook(Book book) {
        this.bookList.add(book);
    }
    public void outputBook() {
        for (Book b: bookList){
            System.out.println(b);
        }
    }
    public void totalPrice() {
        double sum = 0;
        for (Book b: bookList){
            sum += b.getPrice();
        }
        System.out.println(sum);
    }
    public void PriceLess100() {
        int count = 0;
        for (Book b: bookList){
            if (b.getPrice() < 100){
                count += 1;
            }
        }
        System.out.println(count);
    }
    public void CategoryVT1() {
        int count = 0;
        String v = "Viễn tưởng 1";
        for (Book b: bookList) {
            if (b instanceof FictionBook) {
                if (((FictionBook) b).getCategory().equals(v)){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
