package lesson19.hw;

/*
Создать класс Car. Создать в нем поля: mark, age, color, owner.
 */
public class Car {
    private String mark;
    private int age;
    private String color;
    private Owner owner;

    Car(String mark, int age, String color,Owner owner){
        this.mark = mark;
        this.age = age;
        this.color = color;
        this.owner = owner;
    }

    @Override
    public String toString(){
        return this.mark + "\t" + this.age + "\t" + this.color + "\t" + this.owner;
    }
}
