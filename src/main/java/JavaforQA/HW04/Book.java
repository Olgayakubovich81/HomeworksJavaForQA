package JavaforQA.HW04;

import java.util.Objects;

public class Book {
    private String title;

    private int DateOfPublishing;

    private int numberOfPages;
    private Author author;


    public Book(String title, int dateOfPublishing, int numberOfPages, Author author) {
        this.title = title;
        DateOfPublishing = dateOfPublishing;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDateOfPublishing() {
        return DateOfPublishing;
    }

    public void setDateOfPublishing(int dateOfPublishing) {
        DateOfPublishing = dateOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return DateOfPublishing == book.DateOfPublishing && numberOfPages == book.numberOfPages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, DateOfPublishing, numberOfPages, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", DateOfPublishing=" + DateOfPublishing +
                ", numberOfPages=" + numberOfPages +
                ", author=" + author +
                '}';
    }
}



