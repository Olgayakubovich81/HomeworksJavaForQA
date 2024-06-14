package JavaforQA.HW06;

import java.util.HashMap;
import java.util.Map;

// Класс BookStorage для хранения книг в HashMap
public class BookStorage {
    private Map<String, Book> storage = new HashMap<>();

    // Получить все книги из хранилища
    public Map<String, Book> getAllBooks() {
        return storage;
    }

    // Проверить наличие книги по isbn
    public boolean containsBook(String isbn) {
        return storage.containsKey(isbn);
    }

    // Добавить новую книгу в хранилище (сначала проверить что такой книги там нет)
    public boolean addBook(Book book) {
        if (!containsBook(book.getIsbn())) {
            storage.put(book.getIsbn(), book);
            return true;
        }
        return false;
    }

    // Получить книгу из хранилища по ее isbn
    public Book getBook(String isbn) {
        return storage.get(isbn);
    }
}
