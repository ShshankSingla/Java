import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Aditya", 5000);
        Employee e2 = new Employee(102, "Rohit", 4000);

        List<Employee> employees = new ArrayList<>(List.of(e1, e2));

        List<Employee> result = new ArrayList<>();

        for (Employee e : employees) {
            if (e.salary > 2000) {
                result.add(e);
            }
        }

        Collections.sort(result);

        for (Employee e : result) {
            System.out.println(e.name + " " + e.salary);
        }
    }
}

class Employee implements Comparable<Employee> {

    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }
}