import java.lang.reflect.Member;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {  

        Library library = new Library();  
        // Create books  
        Book book1 = new Book("1984", "George Orwell",  "1234567890");  
        Book book2 = new Book("To Kill a Mockingbird", "Harper  Lee", "0987654321");  
        // Add books to the library  
        library.addBook(book1);  
        library.addBook(book2);  


        // List all books  
        System.out.println("Books in the library:");  
        library.listBooks();  
        // Search for a book  
        Book foundBook = library.findBookByTitle("1980");   
        if (foundBook != null) {  
            System.out.println("Found book: " +  foundBook.getTitle());  
        } else {  
            System.out.println("Book not found."); 
        }  



        Scanner scanner = new Scanner(System.in);   
        // Example of user input for adding a book  
        System.out.print("Enter book title: ");  
        String title = scanner.nextLine();  
        // Continue for author and ISBN, then create and add the  book. 




    }  

    
} 


