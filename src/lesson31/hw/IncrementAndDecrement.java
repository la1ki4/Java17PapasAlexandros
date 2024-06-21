package lesson31.hw;

public class IncrementAndDecrement implements Runnable{
    private static int value = 0;

    public void increment(){
        synchronized (this){
            for(int i = 0; i < 5000; i++){
                value++;
            }
        }
    }

    public void decrement(){
        synchronized (this){
            for (int i = 0; i < 1000; i++){
                value--;
            }
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public void run() {
        increment();
        decrement();
    }
}
