package JavaforQA.HW04;

//
//Есть класс книга. У книги есть название,автор, год издания,
//        количество страниц. Автор является отдельным классом
//        У нескольких книг может быть один и тот же автор
//        Создать 10 книг и поместить их в список
//
//
//        Создать несколько вариантов сортировки:
//        1- По названию книги,
//        2- По имени автора,
//        3-По количеству страниц у книги
//        4-По году издания
//
//
//        С консоли запросить  ввод варианта сортировки в виде числа от 1 до 4
//        В зависимости от того, какое число ввели отсортировать коллекцию
//        нужным компаратором


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookSortExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер варианта сортировки (от 1 до 4): ");
        int sortingOption = scanner.nextInt();

        Author author1 = new Author("John", "Doe");
        Author author2 = new Author("Jane", "Smith");
        Author author3 = new Author("Michael", "Johnson");

        Book bookOne = new Book("Путешествие в неизвестность", 2020, 200, author1);
        Book bookTwo = new Book("Секреты мира", 2015, 150, author2);
        Book bookThree = new Book("Летучие драконы", 2018, 180, author3);
        Book bookFour = new Book("Приключения на острове", 2010, 220, author1);
        Book bookFive = new Book("Искусство выживания", 2012, 250, author2);
        Book bookSix = new Book("Тени прошлого", 2016, 180, author3);
        Book bookSeven = new Book("Потерянные миры", 2019, 300, author1);
        Book bookEight = new Book("Магия времени", 2008, 160, author2);
        Book bookNine = new Book("Спасение вселенной", 2017, 190, author3);
        Book bookTen = new Book("Звездный путь", 2014, 210, author1);



    List<Book> books = Arrays.asList(bookOne, bookTwo, bookThree, bookFour, bookFive,
            bookSix, bookSeven, bookEight, bookNine, bookTen);

        if (sortingOption == 1) {
            Collections.sort(books, new BooksSortByTitleComparator());
            System.out.println("Сортировка по названию книги: " + books);
        } else if (sortingOption == 2) {
            Collections.sort(books, new BookSortByAuthorComparator());
            System.out.println("Сортировка по имени и фамилии автора: " + books);
        } else if (sortingOption == 3) {
            Collections.sort(books, new BookSortByNumberOfPagesComparator());
            System.out.println("Сортировка по количеству страниц: " + books);
        } else if (sortingOption == 4) {
            Collections.sort(books, new BookSortByDateOfPublishingComparator());
            System.out.println("Сортировка по году издания: " + books);
        } else {
            System.out.println("Неверный вариант сортировки!");
        }
    }
}









