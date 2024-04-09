package lesson12.hw12;

/*
Переопределите метод printInfo() и go() в
трех разных подклассах.
Например: Car, Truck, Plane ... extends Transport

В этом классе перегрузите метод
calculateDistance(), который может принимать
либо сразу дистанцию int dist, либо
принимать (скорость, время) и результат будет
dist = v * s
 */
public class Car extends Transport{
    @Override
    public void printInfo() {
        System.out.println("This is a car");
    }
    @Override
    public void go() {
        System.out.println("Car rides");
    }

    public int calculateDistance(int dist) {
        return dist;
    }

    public int calculateDistance(int v, int s) {
        return v * s;
    }
}
