package lesson11.hw11;

/*
Создать класс Main, в методе main вывести количество лап объекта Dog
и вызвать метод sleep класса Hamster
 */
public class Main {
    public static void main(String[] args) {
        Dog peter = new Dog("Peter");
        System.out.println("I have " + peter.getPaw() + " paws");
        Hamster lucy = new Hamster("Lucy");
        lucy.sleep();
    }
}
