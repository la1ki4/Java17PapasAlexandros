package lesson11.hw11;
/*
Создайте класс Pet, который является child классом класса Animal. При
вызове его конструктора на экран должно выводиться “I am Pet” и
переменной eyes должно придаться значение 2. Также в класс Pet добавить
переменные name и tail, tail должен равняться 1. Также создать поле paw,
которое будет равно 4. Создать метод run, который выведет на экран
сообщение “Pet runs” и метод jump, который выведет “Pet jumps”.
 */

public class Pet extends Animal{
    protected String name;
    private int tail;
    private int paw;
    Pet(String name){
        super(2);
        this.tail = 1;
        this.name = name;
        this.paw = 4;
        System.out.println("I am Pet");
    }
    public void run(){
        System.out.println("Pet runs");
    }
    public void jump(){
        System.out.println("Pet jumps");
    }
    public int getPaw() {
        return paw;
    }
}
