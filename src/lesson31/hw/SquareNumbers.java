package lesson31.hw;

public class SquareNumbers implements Runnable{

    public void squareNumber(){

        synchronized (this)
        {
            for(int i = 1; i <= 10; i++){
                double x = Math.pow(i,2);
                System.out.println(x);
            }
        }
    }

    @Override
    public void run() {
        squareNumber();
    }
}
