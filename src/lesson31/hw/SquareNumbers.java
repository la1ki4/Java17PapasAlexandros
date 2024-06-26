package lesson31.hw;

public class SquareNumbers implements Runnable{

    public void squareNumber(){
        for(int i = 1; i <= 10; i++) {
            double x = Math.pow(i, 2);
            System.out.println(Thread.currentThread().getName());
            System.out.println(x);
        }
    }

    @Override
    public synchronized void run() {
        squareNumber();
    }
}
