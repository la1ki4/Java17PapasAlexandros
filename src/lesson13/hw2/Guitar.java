package lesson13.hw2;
/*
Гитара содержит переменные класса количествоСтрун
 */
public class Guitar implements Instruments{
    private int numberOfStrings;
    Guitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public void play(){
        System.out.println("Играет гитара с " + numberOfStrings + " струнами");
    }
}
