package lesson11.hw11;

/*
Создать класс Main, в методе main вывести количество лап объекта Dog
и вызвать метод sleep класса Hamster
 */
public class Homework11 {
    public static void main(String[] args) {
        Dog peter = new Dog("Peter");
        System.out.println(peter);
        Hamster lucy = new Hamster("Lucy");
        lucy.sleep();
    }
}
