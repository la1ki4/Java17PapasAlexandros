package lesson17.hw;

/*
Обработать исключения в try catch
 */
public class Main {
    public static void main(String[] args) {
        try {
            Division remainder = new Division(10,0);
            System.out.println("Result of division: " + remainder.divide());
        } catch (ArithmeticException exception){
            System.err.println("Error : " + exception.getMessage());
        }

        try {
            int[] myArray = {1,3,7,2,11};
            MyIntegerArray myIntegerArray = new MyIntegerArray(myArray);
            int index = -1;
            System.out.println("Element of array by index " + index + ": " + myIntegerArray.getElementAtIndex(index));
        } catch (ArrayIndexOutOfBoundsException exception){
            System.err.println("Error : " + exception.getMessage());
        }
    }
}
