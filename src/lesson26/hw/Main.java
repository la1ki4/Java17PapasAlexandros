package lesson26.hw;
/*
Написать пару примеров Stream API:
1 Для терминальных операций используя библиотеку Collectors(joining, groupingBy, partitioningBy... )
2 Для промежуточных операций используем(takeWhile, dropWhile, peek... )
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>(
                List.of(
                        new Book("Little Prince", 128,"Antoine de Saint-Exupéry"),
                        new Book("Война и мир", 1300, "Лев Толстой"),
                        new Book("Судьба человека", 197, "Михаил Шолохов"),
                        new Book("Дама с собачкой", 448,"Антон Чехов"),
                        new Book("Minecraft:Остров", 287,"Макс Брукс"),
                        new Book("Хамелеон", 48, "Антон Чехов")
                )
        );

        System.out.println("Книги, у которых количество страниц от 200: ");
        String titleOfBigBooks = library.stream()
                .filter(book -> book.getPages() >= 200)
                .map(Book::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(titleOfBigBooks + "\n");

        System.out.println("Количество книг в базе данных от разных авторов: ");
        Map<String,Long> countOfBooksByAuthors = library.stream()
                .collect(Collectors.groupingBy(Book::getAuthorName, Collectors.counting()));
        countOfBooksByAuthors.entrySet().forEach(System.out::println);

        System.out.println("\nРазделение книг на количество страниц меньше, чем 200 страниц: ");
        Map<Boolean, List<Book>> someMap = library.stream()
                .collect(Collectors.partitioningBy(book -> book.getPages() < 200));
        someMap.entrySet().forEach(System.out::println);

        System.out.println("\nПеребираем книги, пока не наткнёмся на Антона Чехова: ");
        List<Book> takeWhileLibrary = library.stream()
                .takeWhile(authorName -> !authorName.getAuthorName().equals("Антон Чехов"))
                .toList();
        takeWhileLibrary.forEach(System.out::println);

        System.out.println("\nВыбрасываем книги, пока не наткнёмся на Антона Чехова: ");
        List<Book> dropWhileLibrary = library.stream()
                .dropWhile(authorName -> !authorName.getAuthorName().equals("Антон Чехов"))
                .toList();
        dropWhileLibrary.forEach(System.out::println);

        System.out.println("\nКниги, которые начинаются на букву Д: ");
        List<Book> titleOnD = library.stream()
                .filter(dTitle -> dTitle.getTitle().charAt(0) == 'Д')
                .peek(Book::getTitle)
                .toList();

        titleOnD.forEach(System.out::println);
    }
}
