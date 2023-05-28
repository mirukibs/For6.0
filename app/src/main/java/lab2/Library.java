package lab2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> collection;

    public Library() {
        this.collection = new ArrayList<>();
    }

    public void addBook(Book myBook) {
        collection.add(myBook);
    }

    public Boolean borrowBook(int ISBN) { 
        for (Book myBook : collection) { 
            if (myBook.getIsbn() == ISBN) { 
                if (myBook.getIsBorrowed()) 
                    return false;
                else {
                    myBook.setIsBorrowed(true); 
                    return true;
                } 
            } 
        } 
        return false; 
    }

    public boolean returnBook(int ISBN) {
        for (Book myBook : collection) { 
            if (myBook.getIsbn() == ISBN) { 
                if (!myBook.getIsBorrowed()) { 
                    return false; 
                } 
                myBook.setIsBorrowed(false); 
                return true; 
            } 
        } 
        return false;
    }

    public void printAllBooks() { 
        for (Book myBook : collection) { 
            System.out.println(myBook.toString()); 
        } 
    }

    public ArrayList<Book> getAvailableBooks() {             //To get access to all books not borrowed
        ArrayList<Book> availableBooks = new ArrayList<>(); 
        for (Book myBook : collection) { 
            if (!myBook.getIsBorrowed()) { 
                availableBooks.add(myBook); 
            } 
        } 
 
        return availableBooks; 
    } 

    public List<Book> getAllBooks(){                        //To get access to all books
        return collection; 
    }
}
