package lesson17.hw;

/*
Добавить в свои классы проверку и выкидывать исключения в случае ошибок
 */
public class Division {
    private double dividend;
    private double divisor;

    Division(double dividend, double divisor){
        this.dividend = dividend;
        this.divisor = divisor;
    }
    public double divide() throws ArithmeticException{
        if(divisor == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return dividend / divisor;
    }
}
