package init;

import library.Book;
import library.Reader;


public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Ivanov", "OOO", "+390991234567", "31.03.1980");
        Reader reader1 = new Reader("Petrov", "ORT", "+390991234512", "30.04.1970");
        Book book = new Book("Karenina ", "Pushkin");
        Book book1 = new Book("Lord of rings", "Martin");
Reader[] readers = new Reader[]{reader, reader1};
Book[] books = new Book[]{book, book1};
        reader.takeBook(3);
        reader.returnBook(2);
        reader.takeBook(books);

    }


}



