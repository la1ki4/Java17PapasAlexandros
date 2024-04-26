package lesson19.hw;

/*
Для
поля owner создать класс Owner, который будет содержать поля:
name, age, expirienceAge (опыт вождения).
 */
public class Owner {
    private String name;
    private int age;
    private int expirienceAge;

    Owner(String name, int age,int expirienceAge){
        this.name=name;
        this.age=age;
        this.expirienceAge=expirienceAge;
    }
    @Override
    public String toString(){
        return "(" + this.name + "," + this.age + "," + this.expirienceAge + ")";
    }
}
