package JavaforQA.HW06;

// Класс Book с полями isbn, title, pages
class Book {
    private String isbn;
    private String title;
    private int pages;

    public Book(String isbn, String title, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
