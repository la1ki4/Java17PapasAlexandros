package lesson9.hw.HW9;

public class Student {
    private String name;
    private int age;
    private double averageNote;
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
    public void printStudentInfo(){
        System.out.printf("\nИмя : %s\nВозраст : %d\nСредний бал за курс : %.2f",this.name,this.age,this.averageNote);
    }
    public void checkMark(){
        if (this.averageNote > 5) {
            System.out.printf("\nВаша оценка %.2f, quota выполнена!\n\n",this.averageNote);
        } else {
            System.out.printf("\nК сожалению оценочная quota не выполнена, ваша оценка %.2f\nОценка должна быть больше 5\n",this.averageNote);
        }
    }
}
