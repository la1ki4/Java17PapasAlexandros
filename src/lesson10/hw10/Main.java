package lesson10.hw10;

import java.util.Scanner;

/*
Создайте класс Person с переменными: name, age, height. Для
данного класса используйте инкапсуляцию. Длина имени
должна быть больше 3 и меньше 15. Возраст должен быть
больше 0 и меньше 100 и рост должен быть не меньше 120 и
не больше 220. Создайте метод printPersonInfo, который
будет выводить информацию о человеке, при этом не
используя переменные класса напрямую. В классе Main
создайте объект класса Person и вызовите метод
printPersonInfo со всеми заполненными значениями.
 */

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
