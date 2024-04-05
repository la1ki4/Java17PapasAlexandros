package lesson11.hw11;

/*
Создайте класс Dog, который является Child классом Pet. При вызове
конструктора с параметром name, должно выводиться сообщение “I am dog
and my name is: ” + name. Добавить метод play, который будет выводить на
экран сообщение “Dog plays”
 */
public class Dog extends Pet{
    Dog(String name){
        super(name);
        System.out.println("I am dog and my name is " + this.name);
    }
    public void play(){
        System.out.println("Dog plays");
    }

}
