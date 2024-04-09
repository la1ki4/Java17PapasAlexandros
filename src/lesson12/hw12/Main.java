package lesson12.hw12;

public class Main {
    public static void main(String[] args) {
        Car lightningMcQueen = new Car();
        lightningMcQueen.printInfo();
        lightningMcQueen.go();
        System.out.println("Lightning McQueen drove " + lightningMcQueen.calculateDistance(8700) + "km");
        System.out.println("Lightning McQueen drove " + lightningMcQueen.calculateDistance(60,145) + "km");
        Truck mack = new Truck();
        mack.printInfo();
        mack.go();
        System.out.println("Mack drove " + mack.calculateDist(1500) + "km");
        System.out.println("Mack drove " + mack.calculateDist(60,25) + "km");
        Plane airMoldova = new Plane();
        airMoldova.printInfo();
        airMoldova.go();
        System.out.println("The plane flew " + airMoldova.calculateDist(60,510) + "km");
        System.out.println("The plane flew " + airMoldova.calculateDist(30600) + "km");
    }
}
