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
        } catch (NotFuelException | NotBeltException exception){
            if(exception instanceof NotFuelException){
                System.err.println(exception.getMessage());
            }
            if(exception instanceof NotBeltException){
                System.err.println(exception.getMessage());
            }
        }
    }
}
