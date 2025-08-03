// Author class
class Author {
    String name;

    Author(String name) {
        this.name = name;
    }
}

// Book class
class Book {
    String title;
    Author author;
    boolean isBorrowed;

    Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author.name + ", Borrowed: " + isBorrowed);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("J.K. Rowling");
        Book b1 = new Book("Harry Potter", a1);

        b1.displayInfo();
        b1.borrow();
        b1.displayInfo();
        b1.returnBook();
        b1.displayInfo();
    }
}
