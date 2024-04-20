package lesson18.hw;

/*
Второе пусть является дочерним классом класса Exception и
называется NotBeltException. Также пусть передает параметр
String в конструктор super класса.
 */

public class NotBeltException extends Exception{
    NotBeltException(String notBeltMessage){
        super(notBeltMessage);
    }
}
