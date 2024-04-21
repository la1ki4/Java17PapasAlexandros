package lesson18.hw;

/*
Создайте 2 исключения. Первое будет являтся дочерним классом
класса RuntimeException и в нем создайте конструктор, который
принимает 1 параметр int и передает его в конструктор super
класса. Первое исключение называется NotFuelException.
 */

public class NotFuelException extends RuntimeException{
    NotFuelException(int notFuelMessage){
        super(String.valueOf(notFuelMessage) + " level fuel exception");
    }
}
