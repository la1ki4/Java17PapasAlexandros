package lesson13.hw;

/*
Определить класс Book, реализующий интерфейс Printable.
Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
 */
public class Book implements Printable{
    private String bookTitle;
    Book(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public static void printBooks(Printable[] printableItems){
        for(Printable printableItem : printableItems){
            if(printableItem instanceof Book){
                printableItem.print();
            }
        }
    }
    @Override
    public void print(){
        System.out.println("This is a book " + "'" + bookTitle + "'");
    }
}
