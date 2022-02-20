package Feb14;
import java.util.ArrayList;
import java.util.Scanner;
class Book implements Comparable<Book> 
{
	int id;
    String name, publisher;
    int quantity;
    int price;
    public Book(int id, String name, String publisher, int quantity, int price)
    {
        this.id = id;
        this.name = name; this.publisher = publisher; this.quantity = quantity; this.price = price;
    }
    @Override
    public int compareTo(Book o) 
    {
        if (quantity > o.quantity)
        {
        	return 1;
        } 
        else if (quantity < o.quantity) 
        {
        	return -1;
        }
        return 0;
    }
}
public class Homework4 
{
    static ArrayList<Book> books;
    static Scanner sc;
    public static void main(String[] args) 
    {
        Book b1 = new Book(1001, "Java", "Balaguruswamy", 30, 300);
        Book b2 = new Book(1002, "Advance Java", "Galvin", 25, 450);
        Book b3 = new Book(1003, "Python 2021", "Modi", 253, 4500);
        Book b4 = new Book(1004, "C++ Unexplored", "Jackson", 253, 4500);
        Book b5 = new Book(1005, "let us C", "Balaguruswamy", 253, 4000);
        books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        sc = new Scanner(System.in);
        int temp=0;
        do
        {
            System.out.println("PRESS 1 TO CONTINUE TO MENU");
            temp=sc.nextInt();
            if(temp!=1)
            	return;
            menu();
        }while (temp==1);
    }
    private static void menu() 
    {
        int selection;
        System.out.println("Press 1 To enter new book");
        System.out.println("Press 2 find out the high cost books names and quantity");
        System.out.println("Press 3 find out the books Written by 'Balaguruswamy'");
        System.out.println("Press 0 to exit");
        selection = sc.nextInt();
        switch (selection) 
        {
        	case 1:
        		int id, quantity, price;
                String name, publisher;
                System.out.println("Enter Book ID: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.println("Book Name: ");
                name = sc.nextLine();
                System.out.println("Publisher: ");
                publisher = sc.nextLine();
                System.out.println("Quantity: ");
                quantity = sc.nextInt();
                sc.nextLine();
                System.out.println("Price: ");
                price = sc.nextInt();
                sc.nextLine();
                Book b1 = new Book(id, name, publisher, quantity, price);
                books.add(b1);
                System.out.println("\n\nBook Added");
                break;
            case 2:
            	System.out.println("High cost books are the book that costs more than ₹499");
                for (Book book : books) 
                {
                    if (book.price > 499) 
                    {
                        System.out.println(book.name + " costs \t₹ " + book.price + "/-");
                    }
                }
                break;
            case 3:
                System.out.println("Books whose author is Balaguruswamy");
                for (Book book :books) 
                {
                    if(book.publisher.contains("Balaguruswamy"))
                        System.out.println(book.name + "  Written by: Balaguruswamy");
                }
                break;
            default: 
                System.out.println("Invalid Selection");
        }
    }
}
    