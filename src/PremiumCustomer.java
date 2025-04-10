import java.util.ArrayList;
import java.util.List;

public class PremiumCustomer implements Customer{

    //prop
    private String membershipId;
    private List<Book> purchasedBooks;

    public PremiumCustomer(String membershipId) {
        this.membershipId = membershipId;
        purchasedBooks=new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.membershipId;
    }

    @Override
    public void buyBook(Book book) {
        Book b;
        //ממיר לפי סוג המופע שקיבל
      if (book instanceof FictionBook){
           b=new FictionBook(book.getTitle(),book.getAuthor(),book.getPrice()*0.95);
      }
      else {
          b=new NonFictionBook(book.getTitle(),book.getAuthor(),book.getPrice()*0.95);
      }
      //ומוסיף למערך
        purchasedBooks.add(b);
    }

    @Override
    public List<Book> getPurchasedBooks() {
        return purchasedBooks;
    }

}
