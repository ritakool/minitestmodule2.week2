package book;

public class FictionBook extends Book{
    private String category;
    public FictionBook(){
    }
    public FictionBook(String bookCode, String name, String author, String category, double price){
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook {" +
                "category='" + category + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                " }";
    }
}
