package lesson13.hw;

/*
Определить класс Book, реализующий интерфейс Printable.
 */
public class Book implements Printable{
    private String bookTitle;
    Book(String bookTitle){
        this.bookTitle = bookTitle;
    }
    @Override
    public void print(){
        System.out.println("This is a book " + "'" + bookTitle + "'");
    }
}
