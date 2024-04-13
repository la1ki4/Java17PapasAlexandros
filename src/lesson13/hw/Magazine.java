package lesson13.hw;

/*
Определить класс Magazine, реализующий интерфейс Printable.
 */
public class Magazine implements Printable{
    private String magazineTitle;
    Magazine(String magazineTitle){
        this.magazineTitle = magazineTitle;
    }
    @Override
    public void print() {
        System.out.println("This is magazine " + "'" + magazineTitle + "'");
    }
}
