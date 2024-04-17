package lesson13.hw;

/*
Определить класс Magazine, реализующий интерфейс Printable.
Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof.
 */
public class Magazine implements Printable{
    private String magazineTitle;
    Magazine(String magazineTitle){
        this.magazineTitle = magazineTitle;
    }

    public static void printMagazines(Printable[] printableItems){
        for(Printable printableItem : printableItems){
            if(printableItem instanceof Magazine){
                printableItem.print();
            }
        }
    }
    @Override
    public void print() {
        System.out.println("This is magazine " + "'" + magazineTitle + "'");
    }
}
