package lesson31.hw;

/*
Создайте класс с двумя методами, один из которых увеличивает значение переменной на 1 (в цикле 5000 раз), а другой - уменьшает значение переменной на 1 (в цикле 1000 раз). Оба метода должны использовать synchronized блоки, чтобы избежать race condition (проверьте что изначальное значение изменилось на +4000).

Создайте класс с двумя потоками. Каждый поток должен вызывать один и тот же метод, который выводит на консоль квадрат чисел от 1 до 10

      (double x = Math.pow(i, 2);
      System.out.println(x);

Смоделируйте поведение вывода по порядку сначала   одного потока, затем второго
 */

public class Main {
    public static void main(String[] args) {

        IncrementAndDecrement number = new IncrementAndDecrement();

        Thread thread1 = new Thread(number);
        Thread thread2 = new Thread(number);
        Thread thread3 = new Thread(number);

        thread1.start();
        thread2.start();
        thread3.start();


        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException exception){
            exception.printStackTrace();
        }

        System.out.println(number.getValue());



        SquareNumbers squareNumbers = new SquareNumbers();

        Thread firstSquareThread = new Thread(squareNumbers);
        Thread secondSquareThread = new Thread(squareNumbers);

        firstSquareThread.setName("First Square Thread");
        secondSquareThread.setName("Second Square Thread");

        firstSquareThread.start();
        secondSquareThread.start();
    }
}
