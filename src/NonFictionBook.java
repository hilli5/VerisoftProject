

public class NonFictionBook extends Book {

    private String subject;

    //Constructor with all parameters
    public NonFictionBook(String title, String author, double price,String subject) {
        super(title, author, price);
        this.subject=subject;
    }
    //constructor - Constructor with some parameters
    public NonFictionBook(String title, String author, double price) {
        super(title, author, price);
    }

    //5% discount - return the discount on the book
    @Override
    public double calculateDiscount() {
        return this.getPrice()*0.05;
    }
}
