import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Bookstore
        FictionBook fictionBook=new FictionBook("Code","Hila",100,"Automation");
        NonFictionBook nonFictionBook=new NonFictionBook("Non-Code","Ron",150,"toRead");

        System.out.println("Discount amount for 'Code' book: "+fictionBook.calculateDiscount());
        System.out.println("Discount amount for 'Non-Code' book: "+nonFictionBook.calculateDiscount());

        //CUSTOMERS
        PremiumCustomer premiumCustomer=new PremiumCustomer("12345678");
        RegularCustomer regularCustomer=new RegularCustomer("NOA");

        //To calculate the price
        double price=0;

        System.out.println("Premium customer");
        premiumCustomer.buyBook(fictionBook); //buy book number 1
        premiumCustomer.buyBook(nonFictionBook); //buy book number 2
        //Price Calculation
        for (Book book:premiumCustomer.getPurchasedBooks()){    //Calculating the cost of books
            System.out.println("The price for Premium to - "+ book.getTitle()+" book: "+book.getPrice());
            price+= book.getPrice();
        }
        System.out.println("The price for all book to "+premiumCustomer.getName()+" is: "+ price);

        System.out.println("-----------------------------------------");

        System.out.println("Regular Customer");
        price=0;
        regularCustomer.buyBook(fictionBook); //buy book number 1
        regularCustomer.buyBook(nonFictionBook); //buy book number 2
        //Price Calculation
        for (Book book:regularCustomer.getPurchasedBooks()){//Calculating the cost of books
            System.out.println("The price for Regular for - "+ book.getTitle()+" book: "+book.getPrice());
            price+= book.getPrice();
        }

        System.out.println("The price for all book to "+regularCustomer.getName()+" is: "+ price);
    }

}
