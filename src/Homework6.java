import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {
        //Вводим конечное число
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter finite number: ");
        byte numberLimit = scanner.nextByte();

        //Присваиваем индекс массива, исходя из конечного числа
        byte indexOfArray = numberLimit % 2 == 1 ? ++numberLimit : numberLimit;

        //Создаём массив и проделываем с ним операцию
        byte[] oddNumbers = new byte[indexOfArray/2];
        arrayOnlyWithOddNumbers(oddNumbers);

        //Выводим их значение
        printArray(oddNumbers);

        //Создание и заполнение массива
        byte[][] array2D = new byte[4][4];
        byte number = 1;
        for(byte i = 0 ; i < array2D.length; i++){
            for(byte j = 0; j < array2D[i].length; j++){
                array2D[i][j] = number++;
            }
        }

        //Вывод двумерного массива до перестановок
        print2DArray(array2D);

        //Вывод двумерного массива после перестановки
        System.out.println("\nRearranging elements starting from the top left position:");
        swappingBetweenDiagonalTopLeft(array2D);
        print2DArray(array2D);

        //Вывод двумерного массива после прошлой перестановки
        System.out.println("\nRearranging elements starting from the bottom left position:");
        swappingBetweenDiagonalBottomLeft(array2D);
        print2DArray(array2D);

    }
    public static void swappingBetweenDiagonalBottomLeft(byte[][] array2D){
        for (int i = 3; i > 0; i--){
            for(int j = 0; j < array2D[i].length; j++){
                if(i > j){
                    byte temp = array2D[j][i];
                    array2D[j][i] = array2D[i][j];
                    array2D[i][j] = temp;
                }
            }
        }
    }
    public static void swappingBetweenDiagonalTopLeft(byte[][] array2D){
        for (int i = 0; i < array2D.length; i++){
            for(int j = 1; j < array2D[i].length; j++){
                if(j > i){
                    byte temp = array2D[j][i];
                    array2D[j][i] = array2D[i][j];
                    array2D[i][j] = temp;
                }
            }
        }
    }

    public static void print2DArray(byte[][] array2D){
        for(byte i = 0 ; i < array2D.length; i++){
            for(byte j = 0; j < array2D[i].length; j++){
                System.out.printf("%d\t", array2D[i][j]);
            }
            System.out.println();
        }
    }

    public static void printArray(byte[]array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("array[%d] = %d\n",i,array[i]);
        }
    }

    //Метод, который заносит в массив только нечётные числа
    public static void arrayOnlyWithOddNumbers(byte[] array){
        //Заносим нечётные числа
        for(byte oddNumber = 1, index=0;index< array.length; index++, oddNumber+=2) {
            array[index] = oddNumber;
        }
    }
}