package lesson25.hw;

import java.util.*;

/*
Дан список List<Integer> list
Найти среднее значение чисел в списке, используя метод average().
Получить новый список, состоящий из элементов исходного списка, умноженных на заданное число, используя метод map().
Отфильтровать список строк по заданному условию и получить новый список, используя метод filter().
Получить первый элемент списка, удовлетворяющий заданному условию, используя метод findFirst().
Удалить из списка все дубликаты, используя метод distinct().
Получить максимальный элемент списка, используя метод max().
Отсортировать список в обратном порядке, используя метод sorted().
Посчитать количество элементов в списке, удовлетворяющих заданному условию, используя метод count().
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 1, 4, 5, 6, 4, 7);

        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Среднее значение: " + average);

        List<Integer> multipliedList = list.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println("Список, умноженный на " + 2 + ": " + multipliedList);

        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> filteredList = stringList.stream()
                .filter(s -> s.startsWith("a"))
                .toList();
        System.out.println("Отфильтрованный список строк: " + filteredList);


        Optional<Integer> firstEven = list.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        firstEven.ifPresent(n -> System.out.println("Первое четное число: " + n));

        ;
        List<Integer> distinctList = list.stream()
                .distinct()
                .toList();
        System.out.println("Список без дубликатов: " + distinctList);

        Optional<Integer> maxElement = list.stream()
                .max(Integer::compareTo);
        maxElement.ifPresent(max -> System.out.println("Максимальный элемент: " + max));

        List<Integer> sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Список, отсортированный в обратном порядке: " + sortedList);

        long countGreaterThanFive = list.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("Количество элементов больше 5: " + countGreaterThanFive);
    }
}
