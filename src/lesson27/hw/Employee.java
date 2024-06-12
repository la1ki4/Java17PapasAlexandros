package lesson27.hw;

/*
Создать класс Employee со следующими полями: name (строка), department (строка), salary (число).
 */
public class Employee {
    private String name;
    private String department;
    private int salary;

    Employee(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString(){
        return  "{" + this.name + "," + this.department + "," +  this.salary + "}";
    }
}
