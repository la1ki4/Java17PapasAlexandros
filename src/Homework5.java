import java.util.Scanner;


public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first message: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter second message: ");
        String secondString = scanner.nextLine();
        String upperCaseMessage = upperCaseAndConcatenation(firstString, secondString);
        System.out.println(upperCaseMessage);

        StringBuilder stringBuilder = new StringBuilder(upperCaseMessage);
        removingVowels(stringBuilder);
        String reverseMessage =  reverseMessage(upperCaseMessage);
        System.out.println(reverseMessage);
    }
    public static String upperCaseAndConcatenation(String firstString, String secondString){
        return firstString.toUpperCase()+secondString.toUpperCase();
    }

    public static void removingVowels(StringBuilder stringBuilder){
        String stringWithoutVowels = stringBuilder.toString().replaceAll("[EeUuOoAaIi]","");;
        System.out.println(stringWithoutVowels);
    }

    public static String reverseMessage(String myString){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = myString.length() - 1; i >= 0; i--){
            stringBuilder.append(myString.charAt(i));
        }

        return stringBuilder.toString();
    }
}
