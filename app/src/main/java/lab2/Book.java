package lab2;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean isBorrowed;

    public Book(String title, String author, int isbn, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", ISBN: " + getIsbn();
    }
}
