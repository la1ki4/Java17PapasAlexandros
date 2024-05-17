package lesson24.hw;

/*
Создайте свой функциональный интерфейс с методом
Double сalculate(int a, int b)
Вызовите метод через лямбду
 */
public class Main {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> (double)(a + b);
        Calculator subtraction = (a, b) -> (double)(a - b);

        double sum = addition.calculate(5, 3);
        double difference = subtraction.calculate(8, 3);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
    }
}
