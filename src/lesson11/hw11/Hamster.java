package lesson11.hw11;

/*
Создать класс Hamster, который является Child классом Pet. При вызове его
конструктора с параметром с полем name должно выводиться сообщение “I
am a hamster and my name is:” + name. Добавить метод sleep, который выводит
на экран “Hamster is sleeping”
 */
public class Hamster extends Pet{
    Hamster(String name){
        super(name);
        System.out.println("I am a hamster and my name is: " + this.name);
    }
    public void sleep(){
        System.out.println("Hamster is sleeping");
    }
}