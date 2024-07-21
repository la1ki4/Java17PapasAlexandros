package lesson31.hw;

public class IncrementAndDecrement{
    private static int value = 0;

    public void increment(){
        synchronized (this){
            for(int i = 0; i < 5000; i++){
                value++;
                System.out.println(value + " : " + Thread.currentThread().getName());
            }
        }
    }

    public void decrement(){
        synchronized (this){
            for (int i = 0; i < 1000; i++){
                value--;
                System.out.println(value + " : " + Thread.currentThread().getName());
            }
        }
    }

    public int getValue() {
        return value;
    }

}
