

public class FictionBook extends Book{

    //prop
    private String genre;

    //constructor - Constructor with some parameters
    public FictionBook(String title, String author, double price) {
        super(title, author, price);
    }
    //Constructor with all parameters
    public FictionBook(String title, String author, double price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    //10% discount - return the discount on the book
    @Override
    public double calculateDiscount() {
        return this.getPrice()*0.1;
    }


}
