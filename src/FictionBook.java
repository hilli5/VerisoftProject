

public class FictionBook extends Book{

    //prop
    private String genre;

    public FictionBook(String title, String author, double price) {
        super(title, author, price);
    }

    public FictionBook(String title, String author, double price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    @Override
    public double calculateDiscount() {
        return this.getPrice()*0.9;
    }


}
