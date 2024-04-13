package lesson13.hw;

/*
Создать массив типа Printable, который будет содержать книги и журналы.
В цикле пройти по массиву и вызвать метод print() для каждого объекта.
Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof.
 */
public class Main {

    public static void printMagazines(Printable[] printableItems){
        for(Printable printableItem : printableItems){
            if(printableItem instanceof Magazine){
                printableItem.print();
            }
        }
    }
    public static void printBooks(Printable[] printableItems){
        for(Printable printableItem : printableItems){
            if(printableItem instanceof Book){
                printableItem.print();
            }
        }
    }
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[3];
        printableItems[0] = new Book("Java programming");
        printableItems[1] = new Magazine("Happy woman");
        printableItems[2] = new Book("1001 Secrets of Galaxy");

        for(Printable printableItem : printableItems){
            printableItem.print();
        }
        System.out.println("\nOnly magazines:");
        printMagazines(printableItems);
        System.out.println("\nOnly books:");
        printBooks(printableItems);
    }
}
