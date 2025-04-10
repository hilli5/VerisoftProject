import java.util.ArrayList;
import java.util.List;

public class RegularCustomer  implements Customer{

    private String name;

    //add listBook Attribute for the all book that the customer will buy
    private List<Book> purchasedBooks;

    //constructor -
    //  a way to insert values if there is no setter function
    public RegularCustomer(String name) {
        this.name = name;
        this.purchasedBooks=new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    /*
   Check instance of FictionBook or NonFictionBook and create an object,
   Copies the data and recalculates the price and adds it to the list.
   I can also do a setPrice function in Book and edit the price by set and get.
   Calculate price:  Original price - Discount result by type = price
   */
    @Override
    public void buyBook(Book book) {
        Book b;
        if (book instanceof FictionBook)
            b=new FictionBook(book.getTitle(),book.getAuthor(),book.getPrice()-book.calculateDiscount());
        else
            b=new NonFictionBook(book.getTitle(),book.getAuthor(),book.getPrice()-book.calculateDiscount());
        //add to list
        purchasedBooks.add(b);
    }

    @Override
    public List<Book> getPurchasedBooks() {
        return this.purchasedBooks;
    }
}
