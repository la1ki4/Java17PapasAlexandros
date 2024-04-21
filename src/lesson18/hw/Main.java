package lesson18.hw;

/*
Вызов исключений в классе Main
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lamborghini", "red");
        try {
            car.drive(0);
            car.safetyBelt("Not Belt");
        } catch (Exception exception){
            System.err.println(exception.getMessage());
        }
    }
}
