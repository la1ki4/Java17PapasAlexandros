package lesson9.hw.HW9;

public class Homework9 {
    public static void main(String[] args) {
        Student andrei = new Student("Андрей",19,5.1f);
        andrei.printStudentInfo();
        andrei.checkMark();

        Student nullStudent = new Student();
        nullStudent.printStudentInfo();
        nullStudent.checkMark();

        Student copyAndrei = new Student(andrei);
        copyAndrei.printStudentInfo();
        copyAndrei.checkMark();

        Book aLittlePrince = new Book("'Маленький принц'",128);
        aLittlePrince.printBookName();
        aLittlePrince.printQuantityOfPage();
    }
}
