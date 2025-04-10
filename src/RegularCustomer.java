import java.util.ArrayList;
import java.util.List;

public class RegularCustomer  implements Customer{

    private String name;

    private List<Book> purchasedBooks;

    public RegularCustomer(String name) {
        this.name = name;
        this.purchasedBooks=new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void buyBook(Book book) {
        this.purchasedBooks.add(book);
    }

    @Override
    public List<Book> getPurchasedBooks() {
        return this.purchasedBooks;
    }
}
