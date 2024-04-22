package JavaforQA.HW04;

import java.util.Comparator;

public class BookSortByAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int firstNameComparison = o1.getAuthor().getFirstName().compareTo(o2.getAuthor().getFirstName());
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        return o1.getAuthor().getLastName().compareTo(o2.getAuthor().getLastName());
    }
}
