package lesson13.hw2;
/*
Барабан содержит переменные класса размер
 */
public class Drum implements Instruments{
    private int drumSize;
    Drum(int drumSize){
        this.drumSize = drumSize;
    }
    @Override
    public void play(){
        System.out.println("Играют барабаны с размерностью " + drumSize + " см");
    }
}
