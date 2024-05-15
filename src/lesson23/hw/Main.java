package lesson23.hw;

/*
Создать свой класс MyList or MySet or MyQueue
Имплементировать методы().
Прописать бизнес логику в ваши методы.
Использовать методы класса MyList
 */
public class Main {
    public static void main(String[] args) {
        MyList<String> myProductList = new MyList<>();
        myProductList.add("apple");
        myProductList.add("banana");
        myProductList.add("cherry");

        printList(myProductList);
        myProductList.addAtIndex(2,"cucumber");
        myProductList.addAtIndex(1,"potato");
        System.out.println();
        printList(myProductList);
        System.out.println("\n" + myProductList.getMiddle());

    }

    public static void printList(MyList<String> myProductList){
        for(String listValue : myProductList){
            System.out.println(listValue);
        }
    }
}
