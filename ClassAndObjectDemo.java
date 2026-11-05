// A class is a blueprint; each object stores its own data.
class Book {
    String title;
    String author;

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        Book firstBook = new Book();
        firstBook.title = "The Java Journey";
        firstBook.author = "Amina";

        Book secondBook = new Book();
        secondBook.title = "Learning to Code";
        secondBook.author = "Ali";

        firstBook.displayDetails();
        System.out.println();
        secondBook.displayDetails();
    }
}
