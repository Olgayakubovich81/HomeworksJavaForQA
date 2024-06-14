package JavaforQA.HW06;

public class Main {
    public static void main(String[] args) {
        // Создать хранилище
        BookStorage bookStorage = new BookStorage();

        // Создать 5 книг
        Book book1 = new Book("123", "Java Programming", 500);
        Book book2 = new Book("456", "Effective Java", 300);
        Book book3 = new Book("789", "Clean Code", 250);
        Book book4 = new Book("012", "Design Patterns", 400);
        Book book5 = new Book("345", "Algorithms", 350);

        // Добавить книги в хранилище
        bookStorage.addBook(book1);
        bookStorage.addBook(book2);
        bookStorage.addBook(book3);
        bookStorage.addBook(book4);
        bookStorage.addBook(book5);

        // Получить список книг и вывести в консоль
        System.out.println("Список всех книг в хранилище:");
        for (Book book : bookStorage.getAllBooks().values()) {
            System.out.println(book);
        }

        // Получить любую книгу и вывести в консоль
        System.out.println("\nПолучить книгу с ISBN '456':");
        System.out.println(bookStorage.getBook("456"));

        // Добавить новую книгу и после вывести список книг в консоль
        Book book6 = new Book("678", "New Book", 150);
        bookStorage.addBook(book6);

        System.out.println("\nСписок всех книг после добавления новой книги:");
        for (Book book : bookStorage.getAllBooks().values()) {
            System.out.println(book);
        }
    }
}


