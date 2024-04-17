package lesson17.hw;

/*
Добавить в свои классы проверку и выкидывать исключения в случае ошибок
 */
public class MyIntegerArray {
    private int[] array;

    public MyIntegerArray(int[] array){
        this.array = array;
    }

    public int getElementAtIndex(int index) throws ArrayIndexOutOfBoundsException {
        if(index < 0 || index >= array.length){
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        return array[index];
    }
}
