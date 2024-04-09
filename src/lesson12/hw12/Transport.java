package lesson12.hw12;

/*
Cоздайте абстрактный класс Transport и
переопределите метод printInfo() и go() в
трех разных подклассах.
Например: Car, Truck, Plane ... extends Transport
 */

public abstract class Transport {
    public abstract void printInfo();
    public abstract void go();
}
