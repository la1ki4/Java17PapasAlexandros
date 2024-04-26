package lesson19.hw;

import java.util.ArrayList;

/*
В главном классе создать 5 объектов класса Car
Создать ArrayList и использовать методы: add(), addAll(), set(),
indexOf(), size(), contains(), get(), remove(), lastIndexOf(), isEmpty(),
clear() для этих объектов
 */
public class Main {

    public static void printCars(ArrayList<Car> cars){
        for(Car car : cars){
            System.out.println(car);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", 3,"Red",new Owner("Nikita",21,3));
        Car ferrari = new Car("Ferrari", 2,"Red",new Owner("Kolya",34,10));
        Car blackBoomer = new Car("BMW", 15, "Black", new Owner("Dima", 21,2));
        Car mersedesBenz = new Car("MersedesBenz",4,"White", new Owner("Jenya", 28, 5));
        Car volkswagen = new Car("Volkswagen",5,"Gray", new Owner("Sanya",22,2));

        ArrayList<Car> carsOfMyFriends = new ArrayList<>();
        carsOfMyFriends.add(lamborghini);
        carsOfMyFriends.add(ferrari);
        carsOfMyFriends.add(blackBoomer);
        carsOfMyFriends.add(mersedesBenz);
        carsOfMyFriends.add(volkswagen);
        System.out.println("Cars of my friends:");
        printCars(carsOfMyFriends);

        ArrayList<Car> carsShop = new ArrayList<>();
        System.out.println("Cars in my shop:");
        carsShop.addAll(carsOfMyFriends);
        printCars(carsShop);

        System.out.println("Update car in my shop:");
        carsShop.set(3, new Car("Toyota",3,"White",new Owner("Valera", 35,14)));
        printCars(carsShop);

        int volkswagenPosition = carsShop.indexOf(volkswagen);
        System.out.println("Volkswagen position: " + volkswagenPosition);

        int totalCarsInShop = carsShop.size();
        System.out.println("Total cars in shop: " + totalCarsInShop);

        String carInShop = carsShop.contains(ferrari) ? "We have this car in shop" : "We don't find this car in our shop";
        System.out.println(carInShop);
        System.out.println(carsShop.get(2));
        carsShop.remove(ferrari);
        System.out.println("\nCars in shop: ");
        printCars(carsShop);

        System.out.println("Last position car: " + carsShop.lastIndexOf(volkswagen));
        carsShop.clear();
        String shopStatement = carsShop.isEmpty() ? "Shop is empty" : "Shop isn't empty";
        System.out.println(shopStatement);

    }
}
