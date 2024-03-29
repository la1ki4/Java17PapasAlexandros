package lesson9.hw.HW9;

//Класс студента
public class Student {
    //Поля с именем, возрастом и средним балом студента
    private String name;
    private int age;
    private double averageNote;

    //Конструктор по умолчанию, конструтор с параметрами, конструктор копирования
    Student(){

    }
    Student(String name, int age,float averageNote){
        this.age = age;
        this.name = name;
        this.averageNote = averageNote;
    }
    Student(Student copyStudent){
        age = copyStudent.age;
        name = copyStudent.name;
        averageNote = copyStudent.averageNote;
    }

    //Вывод данных студента
    public void printStudentInfo(){
        System.out.printf("\nИмя : %s\nВозраст : %d\nСредний бал за курс : %.2f",this.name,this.age,this.averageNote);
    }
    //Проверка на проходной бал
    public boolean checkMark(){
        return this.averageNote > 5;
    }
}
