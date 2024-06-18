package lesson31.hw;

public class IncrementAndDecrement{
    private volatile int number;

    IncrementAndDecrement(int number){
        this.number = number;
    }

    public void incrementMethod(){
        synchronized (this){
            for(int i = 0; i < 5000; i++){
                System.out.println(number);
                number++;
            }
        }
    }

    public void decrementMethod(){
        synchronized (this){
            for(int i = 0; i < 1000; i++){
                System.out.println(number);
                number--;
            }
        }
    }

    @Override
    public String toString() {
        return "IncrementAndDecrement{" +
                "number=" + number +
                '}';
    }
}
