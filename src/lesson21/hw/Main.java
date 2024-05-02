package lesson21.hw;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> plates = new Stack<>();
        plates.add("plate1");
        plates.add("plate2");
        plates.add("plate3");
        plates.add("plate4");
        plates.add("plate5");

        while (!plates.empty()){
            System.out.println(plates.pop());
        }

        Queue<String> shopQueue = new LinkedList<>();
        shopQueue.add("client1");
        shopQueue.add("client2");
        shopQueue.add("client3");
        shopQueue.add("client4");
        shopQueue.add("client5");

        while (!shopQueue.isEmpty()){
            System.out.println(shopQueue.poll());
        }

        Queue<Car> cars = new PriorityQueue<>();
        cars.add(new Car("Lamborghini", 2020));
        cars.add(new Car("Ferrari", 2012));
        cars.add(new Car("Lada", 1974));
        cars.add(new Car("BMW", 2012));
        cars.add(new Car("Ford", 2023));

        while (!cars.isEmpty()){
            System.out.println(cars.poll());
        }
    }
}
