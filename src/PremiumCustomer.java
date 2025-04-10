import java.util.ArrayList;
import java.util.List;

public class PremiumCustomer implements Customer{

    //Attribute
    private  String membershipId;

    //add listBook Attribute for the books that the customer will buy
    private  List<Book> purchasedBooks;

    //constructor - a way to insert values
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
    Copies the data and recalculates the price and adds it to the list.
    I can also do a setPrice function in Book and edit the price by set and get.
    Calculate price:  Discount for Premium Customer - Discount result by type = price
    */
    @Override
    public void buyBook(Book book) {
        Book b;
      if (book instanceof FictionBook)
          b=new FictionBook(book.getTitle(),book.getAuthor(),book.getPrice()-(book.getPrice()*0.05+book.calculateDiscount()));
      else
          b=new NonFictionBook(book.getTitle(),book.getAuthor(),book.getPrice()-(book.getPrice()*0.05+book.calculateDiscount()));
        //add to list
        purchasedBooks.add(b);
    }

    @Override
    public List<Book> getPurchasedBooks() {
        return purchasedBooks;
    }

}
