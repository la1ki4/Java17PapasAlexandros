package lesson21.hw;

/*
Создать класс Car. Добавить поля name и age. Имплементировать интерфейс Comparable и
переопределить метод compareTo так, чтобы наивысший приоритет был у минимального элемента
 */

public class Car implements Comparable<Car>{
    private String name;
    private int age;

    Car(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Car o) {
        if (o.age - this.age == 0){
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;
    }

    @Override
    public String toString(){
        return "{" + this.name + "," + this.age + "}";
    }
}
