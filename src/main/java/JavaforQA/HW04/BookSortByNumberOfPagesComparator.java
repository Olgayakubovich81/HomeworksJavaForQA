package JavaforQA.HW04;

import java.util.Comparator;

public class BookSortByNumberOfPagesComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getNumberOfPages(), o2.getNumberOfPages());
            }
        }




