package lesson10.hw10;

import java.util.Scanner;

public class Main {
    //Метод, заполняющий данные человека
    public static void fillingPerson(Person somePerson){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter person's name: ");
        somePerson.setName(scanner.next());
        System.out.print("Enter person's age: ");
        somePerson.setAge(scanner.nextByte());
        System.out.print("Enter person's height: ");
        somePerson.setHeight(scanner.nextFloat());
    }
    public static void main(String[] args) {
        Person vasea = new Person();
        fillingPerson(vasea);
        vasea.printPersonInfo();
    }
}
