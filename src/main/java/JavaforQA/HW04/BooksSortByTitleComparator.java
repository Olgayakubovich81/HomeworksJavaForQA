package JavaforQA.HW04;

import java.util.Comparator;

public class BooksSortByTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
