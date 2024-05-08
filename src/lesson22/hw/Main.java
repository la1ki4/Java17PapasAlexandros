package lesson22.hw;

/*
Создайте HashMap, содержащий пары значений - имя игрушки (String) и объект игрушки (класс Toy(weight int, String color, double  price )).
Перебрать и распечатать пары значений - entrySet().
Перебрать и распечатать набор из имен продуктов - keySet().
Перебрать и распечатать значения продуктов - values().
Для каждого перебора создать свой метод.
 */

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void printSet(Map<String,Toy> toyShop){
        System.out.println(toyShop.entrySet());
    }

    public static void printToysNames(Map<String,Toy> toyShop){
        System.out.println(toyShop.keySet());
    }

    public static void printToysSpecifications(Map<String,Toy> toyShop){
        System.out.println(toyShop.values());
    }

    public static void main(String[] args) {
        Map<String, Toy> toyShop = new HashMap<>();
        toyShop.put("Barbie", new Toy(1,"Pink",120));
        toyShop.put("BMW", new Toy(3,"Black",160));
        toyShop.put("Stitch", new Toy(2,"Blue",130));
        toyShop.put("Hello Kitty", new Toy(1,"Pink",160));
        toyShop.put("Freddy", new Toy(1,"Gold",140));

        printSet(toyShop);
        printToysNames(toyShop);
        printToysSpecifications(toyShop);

    }
}
