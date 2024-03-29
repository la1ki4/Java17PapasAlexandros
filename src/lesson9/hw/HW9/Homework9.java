package lesson9.hw.HW9;

public class Homework9 {
    public static void main(String[] args) {
        //Создание объекта при помощи конструктора с параметрами
        Student andrei = new Student("Андрей",19,5.1f);
        andrei.printStudentInfo();
        String message = andrei.checkMark() ? "\nQuota выполнена" : "\nQuota не выполнена";
        System.out.println(message);

        //Создание объекта при помощи конструктора по умолчанию
        Student nullStudent = new Student();
        nullStudent.printStudentInfo();
        message = nullStudent.checkMark() ? "\nQuota выполнена" : "\nQuota не выполнена";
        System.out.println(message);

        //Создание объекта при помощи конструктора копирования
        Student copyAndrei = new Student(andrei);
        copyAndrei.printStudentInfo();
        message = copyAndrei.checkMark() ? "\nQuota выполнена" : "\nQuota не выполнена";
        System.out.println(message);

        //Создание объекта книги и вывод информации о книге
        Book aLittlePrince = new Book("'Маленький принц'",128);
        aLittlePrince.printBookName();
        aLittlePrince.printQuantityOfPage();
    }
}
