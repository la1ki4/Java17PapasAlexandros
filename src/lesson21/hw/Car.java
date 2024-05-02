package lesson21.hw;

public class Car implements Comparable<Car>{
    private String name;
    private int age;

    Car(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Car o) {
        if (((Car)o).age - this.age == 0){
            return this.name.compareTo(((Car)o).name);
        }
        return this.age - ((Car)o).age;
    }

    @Override
    public String toString(){
        return "{" + this.name + "," + this.age + "}";
    }
}
