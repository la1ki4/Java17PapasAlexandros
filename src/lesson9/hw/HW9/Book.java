package lesson9.hw.HW9;

//Класс книга
public class Book {
    //Поля, хранящие имя и количество страницы в книге
    private String name;
    private int quantityOfPage;

    //Конструктор с двумя параметрами
    Book(String name, int quantityOfPage){
        this.name = name;
        this.quantityOfPage = quantityOfPage;
    }

    //Метод, который выводит имя книги
    public void printBookName(){
        System.out.println("Book name: " + this.name);
    }

    //Метод, который выводит количество страниц
    public void printQuantityOfPage(){
        System.out.println("Quantity of page: " + this.quantityOfPage);
    }
}
