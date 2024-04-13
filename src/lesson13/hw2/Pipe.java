package lesson13.hw2;
/*
Труба содержит переменные класса диаметр.
 */
public class Pipe implements Instruments{
    double diameter;

    Pipe(double diameter){
        this.diameter = diameter;
    }
    @Override
    public void play(){
        System.out.println("Играет труба, с диаметром " + diameter + " см");
    }
}
