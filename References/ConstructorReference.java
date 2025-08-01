package References;

import java.util.function.Function;

class Book {
    String title;

    Book(String title) {
        this.title = title;
        System.out.println("Book created with title: " + title);
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        // Constructor reference with one parameter
        Function<String, Book> bookCreator = Book::new;

        // Create a new Book object
        Book myBook = bookCreator.apply("Java Essentials");
    }
}

