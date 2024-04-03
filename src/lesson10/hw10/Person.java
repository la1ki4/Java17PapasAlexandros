package lesson10.hw10;

//Класс 'Человек'
public class Person {
    //Поля имени, возраста, высоты
    private String name;
    private byte age;
    private float height;

    //Геттер и сеттер для возраста человека
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        if(age >= 0 && age <= 100) {
            this.age = age;
        }
    }
    //Геттер и сеттер для роста человека
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        if(height >= 120 && height < 220){
            this.height = height;
        }
    }
    //Геттер и сеттер для имени человека
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.length() >= 3 && name.length() <= 15){
            this.name = name;
        }
    }

    //Метод, который выводит всю информацию о человеке
    public void printPersonInfo(){
        System.out.printf("Person name: %s\nPerson age: %d\nPerson height: %.1f",getName(),getAge(),getHeight());
    }
}
