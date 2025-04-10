
public abstract class Book {

    //prop
    private String title;
    private String author;
    private double price;

    //constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    //getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    //abstract method
    public  abstract double calculateDiscount();
}
