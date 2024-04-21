package lesson18.hw;

/*
Вызов исключений в классе Main
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lamborghini", "red");
        try {
            car.drive(1);
            car.safetyBelt("Not Belt");
        } catch (NotFuelException notFuelException){
            System.err.println(notFuelException.getMessage());
        } catch (NotBeltException notBeltException){
            System.err.println(notBeltException.getMessage());
        }
    }
}
