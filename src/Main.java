
public class Main {
    public static void main(String[] args) {
        //Bookstore
        FictionBook fictionBook=new FictionBook("Code","hila",100,"Automation");
        NonFictionBook nonFictionBook=new NonFictionBook("Non-Code","Ron",150,"toRead");

        //CUSTOMERS
        PremiumCustomer premiumCustomer=new PremiumCustomer("12345678");
        RegularCustomer regularCustomer=new RegularCustomer("NOA");

        //for the price
        double price=0;

        //Premium Customer
        premiumCustomer.buyBook(fictionBook); //buy book number 1
        premiumCustomer.buyBook(nonFictionBook); //buy book number 2
        //Price Calculation
        System.out.println("Premium customer");
        for (Book book:premiumCustomer.getPurchasedBooks()){
            price+= book.calculateDiscount();
            System.out.println("The price for "+book.getTitle()+" is: "+ price);
        }
        System.out.println("The price for premium customer: "+ price);
        System.out.println("-----------------------------------------");
        //Regular Customer
        System.out.println("Regular Customer");
        price=0;
        regularCustomer.buyBook(fictionBook); //buy book number 1
        regularCustomer.buyBook(nonFictionBook); //buy book number 2
        //Price Calculation
        for (Book book:premiumCustomer.getPurchasedBooks()){
            price+= book.calculateDiscount();
            System.out.println("The price for "+book.getTitle()+" is: "+ price);
        }
        System.out.println("The price for regular customer is: "+ price);
    }

}
