package pl.sda.bookstore;

import java.util.List;

//CRUD - Create Read Update Delete
public interface BookDAO {
    void addNewBookToStorage(Book book);
    void addBooksToStorage(List<Book> books);
    void updateBookCount(Book book, int diff);
    void showStorageState();
    void sortByTitle();
    void sortByRating();
    void removeBookFromStorage(Book book);
    void updateBook(Book book);

}
