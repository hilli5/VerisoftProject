import java.util.ArrayList;
import java.util.List;

public class PremiumCustomer implements Customer{

    //Attribute
    private  String membershipId;
    //add listBook Attribute for the books that the customer will buy
    private  List<Book> purchasedBooks;

    //constructor -
    public PremiumCustomer(String membershipId) {
        this.membershipId = membershipId;
        purchasedBooks=new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.membershipId;
    }

    /*
    Check instance of FictionBook or NonFictionBook and create an object,
    Copies the data and recalculates the price and adds it to the list else only add the book.
    Calculate price: Original price - ( Discount for Premium Customer + Discount result by type ) = price
    */
    @Override
    public void buyBook(Book book) {
        Book b;
        if (book instanceof FictionBook){
            b=new FictionBook(book.getTitle(),book.getAuthor(),book.getPrice()-(book.calculateDiscount()+book.getPrice()*0.05));
            purchasedBooks.add(b);
        }
        else if (book instanceof NonFictionBook){
            b=new NonFictionBook(book.getTitle(),book.getAuthor(),book.getPrice()-(book.calculateDiscount()+book.getPrice()*0.05));
            purchasedBooks.add(b);
        }
        else
            purchasedBooks.add(book);
    }

    @Override
    public List<Book> getPurchasedBooks() {
        return purchasedBooks;
    }

}
