package lesson27.hw;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Создать список из нескольких экземпляров класса Employee.
С помощью метода groupBy создать мапу, где ключом будет department, а значением - список сотрудников из данного департамента.
Использовать метод partitioningBy, чтобы разделить список сотрудников на две части: одна - сотрудники с зарплатой выше среднего, другая - сотрудники с зарплатой ниже или равной средней.
Использовать метод joining, чтобы получить строку со списком всех департаментов через запятую
 */

public class Main {

    public static void main(String[] args) {
        List<Employee> employers = List.of(
                new Employee("Tanya", "cashier", 9000),
                new Employee("Sergey", "Java Developer", 30000),
                new Employee("Alexey", "cashier", 10000)
        );

        System.out.println("Сотрудники, разбитые по профессиям: ");
        Map<String, List<Employee>> listOfEmployeesDepartment = employers.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        listOfEmployeesDepartment.forEach((department, employeeList) -> {
            System.out.println(department + ": " + employeeList);
        });
        System.out.println();

        double averageSalary = employers.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        Map<Boolean, List<Employee>> listOfEmployeeSalary = employers.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() > averageSalary));
        System.out.println("Cотрудники с зарплатой выше среднего: " + listOfEmployeeSalary.get(true));
        System.out.println("Сотрудники с зарплатой ниже среднего: " + listOfEmployeeSalary.get(false));

        String allDepartments = employers.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.joining(", "));
        System.out.println("Все отделы в БД: " + allDepartments);

    }
}
