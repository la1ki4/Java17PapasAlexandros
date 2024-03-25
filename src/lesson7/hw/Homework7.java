package lesson7.hw;
public class Homework7 {

    public static void main(String[] args) {
        int[] test1 = {2,3,4,6,10,11,12};
        test1 = filterIntArray(test1);
        printIntArray(test1);
        String[] test2 = {"Alexey", "Maxim", "Kolya", "Rodion", "Evgenii"};
        test2 = filterStringArray(test2);
        printStringArray(test2);
        int[] test3 = {0,1,2,3,4,5,6,7,8,9};
        test3 = powerIntArray(test3);
        printIntArray(test3);
        String[] test4 = {"Orange", "Apple", "Tomato", "cucumber"};
        boolean wordIsHere =checkWord(test4,"CUCUMBER");
        System.out.println(wordIsHere);
        int[][] test5 = {{1,5},{2,1,3,4},{1,6,2}};
        int[] test5Output = biggestRowInMatrix(test5);
        printIntArray(test5Output);
    }

    // 1. Дан массив целых чисел. Вернуть массив только четных чисел.
    public static int[] filterIntArray(int[] array) {
        //Запоминаем количество чётных чисел в массиве
        byte countOfEvenNumbers = 0;
        for (int number : array) {
            if (number % 2 == 0)
                countOfEvenNumbers++;
        }

        //На основе количества чётных чисел создаём новый массив с фиксированной размерностью
        int[] output = new int[countOfEvenNumbers];

        //Записываем только чётные числа в новый массив
        byte index = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                output[index++] = number;
            }
        }

        return output;
    }

    //2. Дан массив строк. Вернуть массив строк содержащих букву 'а'.
    public static String[] filterStringArray(String[] array){

        //Создаём выходной массив, шаблон и количество слов с буквой 'a'
        String[] output;
        String template = "a";
        byte countOfWordsWithLetter_a = 0;

        //Считаем сколько всего в массиве слов с буквой 'a'
        for (String string : array) {
            if (string.contains(template)) {
                countOfWordsWithLetter_a++;
            }
        }

        //Задаём фиксированную размерность на основе количества слов с буквой 'a'
        output = new String[countOfWordsWithLetter_a];

        //Записываем в выходной массив слова только с буквой 'a'
        byte index = 0;
        for(String input: array){
            if(input.contains(template)){
                output[index++] = input;
            }
        }

        return output;
    }
    // 3. Дан массив целых чисел. Вернуть массив квадратов этих чисел.
    public static int[] powerIntArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] *= array[i];
        }

        return array;
    }

    // 4. Дан массив строк. Проверить содержится ли слово в массиве, игнорируя case.
    public static boolean checkWord(String[] inputArray, String word){
        for(String input : inputArray){
            if(input.equalsIgnoreCase(word)){
                return true;
            }
        }
        return false;
    }

    // 5. Дана матрица целых чисел. Вернуть строку в матрице с наибольшей суммой элементов.
    public static int[] biggestRowInMatrix(int[][] matrix) {
        int sumOfRow = 0;
        byte indexOfbiggestSumOfRow = 0;
        int biggestSumOfRow = 0;
        for(byte i = 0; i < matrix.length; i++){
            for(byte j = 0; j < matrix[i].length; j++){
                sumOfRow += matrix[i][j];
            }
            if(sumOfRow > biggestSumOfRow)
            {
                biggestSumOfRow = sumOfRow;
                indexOfbiggestSumOfRow = i;
                sumOfRow = 0;
            }
        }
        int[] output = new int[matrix[indexOfbiggestSumOfRow].length];

        for(byte i = 0; i < output.length; i++){
            output[i] = matrix[indexOfbiggestSumOfRow][i];
        }

        return output;
    }

    public static void printIntArray(int[] array){
        for(int number: array){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void printStringArray(String[] array){
        for(String word: array){
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
