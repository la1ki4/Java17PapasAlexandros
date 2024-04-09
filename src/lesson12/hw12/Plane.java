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
public class Plane extends Transport{
    @Override
    public void printInfo() {
        System.out.println("This is a plane");
    }

    @Override
    public void go() {
        System.out.println("The plane is flying");
    }
    public int calculateDist(int dist){
        return dist;
    }
    //dist = v * s
    public int calculateDist(int v, int s){
        return v * s;
    }
}
