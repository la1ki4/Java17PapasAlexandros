package lesson11.hw11;

/*
Создайте класс Animal. При вызове его конструктора на экран должно
выводиться «I am Animal». В классе создайте переменную eyes и методы eat,
который будет выводить “Animal eats" и drink, который будет выводить “Animal
drinks”.
 */

public class Animal {
    private int eyes;
    Animal(int eyes){
        this.eyes = eyes;
        System.out.println("I am Animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void drink(){
        System.out.println("Animal drinks");
    }
}