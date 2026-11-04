import java.util.*;

public class Demo1 {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Aditya", 60000);
        Employee e2 = new Employee(102, "Rohit", 70000);

        List<Employee> employees = new ArrayList<>(List.of(e1, e2));

        List<String> result = employees.stream()
                .filter(x -> x.salary > 50000)
                .map(x -> x.name)
                .sorted()
                .toList();

        for (String n : result) {
            System.out.println(n);
        }
    }
}

class Employee {
    int empId;
    String name;
    int salary;

    Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}