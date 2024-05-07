package lesson22.hw;

public class Toy {
    private int weight;
    private String color;
    private double price;

    Toy(int weight, String color, double price){
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "{" + this.weight + "," + this.color + "," + this.price + "}";
    }
}
