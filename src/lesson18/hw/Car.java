package lesson18.hw;

/*
Создать класс Car. Создать аттрибуты name, color и fuelLevel.
Первый метод drive будет иметь тип данных void и параметр int.
Если данный параметр равен нулю, то пусть выбрасывается
исключение NotFuelException.
Второй метод safetyBelt пусть принимает String и если в строке
будет значение "Not Belt", то пусть выбрасывается
NotBeltException. Если нет, то пусть выводит сообщение "Car is
running"
 */
public class Car {
    private String name;
    private String color;
    private int fuelLevel;

    Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void drive(int fuelLevel) throws NotFuelException{
        if(fuelLevel == 0){
            throw new NotFuelException(fuelLevel);
        }
        this.fuelLevel = fuelLevel;
    }

    public void safetyBelt(String beltStatement) throws NotBeltException{
        if(beltStatement.equals("Not Belt")){
            throw new NotBeltException("Car running exception");
        }
        System.out.println("Car is running");
    }
}
