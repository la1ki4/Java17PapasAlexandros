package lesson30.hw;

/*
Использовать "ленивую" реализацию Singleton и создать класс луна (Moon)
и реализовать в нем методы getInstance(), whoIsFirstManOnMe(), checkTemperature()

Использовать "eager" реализацию Singleton и создать класс  (Voldemort)
и реализовать в нем методы getInstance(), avadaKedavra(), isAlive()
 */

public class Main {
    public static void main(String[] args) {
        Moon moon = Moon.getInstance();
        System.out.println(moon.whoIsFirstManOnMe());
        System.out.println(moon.checkTemperature());
        System.out.println(moon);

        Moon moon1 = Moon.getInstance();
        System.out.println(moon1.whoIsFirstManOnMe());
        System.out.println(moon1.checkTemperature());
        System.out.println(moon1);
        
        Voldemort voldemort = Voldemort.getInstance();
        System.out.println(voldemort.avadaKedavra());
        System.out.println(voldemort.isAlife());
        System.out.println(voldemort);

        Voldemort voldemort1 = Voldemort.getInstance();
        System.out.println(voldemort1.avadaKedavra());
        System.out.println(voldemort1.isAlife());
        System.out.println(voldemort1);
    }
}
