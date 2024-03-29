package lesson9.hw.HW9;

public class Book {
    private String name;
    private int quantityOfPage;

    Book(String name, int quantityOfPage){
        this.name = name;
        this.quantityOfPage = quantityOfPage;
    }

    public void printBookName(){
        System.out.println("Book name: " + this.name);
    }
    public void printQuantityOfPage(){
        System.out.println("Quantity of page: " + this.quantityOfPage);
    }
}
