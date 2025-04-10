

public class NonFictionBook extends Book {

    private String subject;

    public NonFictionBook(String title, String author, double price,String subject) {
        super(title, author, price);
        this.subject=subject;
    }
    public NonFictionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public double calculateDiscount() {
        return this.getPrice()*0.95;
    }
}
