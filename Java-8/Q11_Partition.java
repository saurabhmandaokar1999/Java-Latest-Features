import java.util.*;
import java.util.stream.Collectors;

public class Q11_Partition {

    static class Employee {
        String name; double salary;
        Employee(String n,double s){ name=n; salary=s; }
        public double getSalary(){ return salary; }
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("A",50000),
            new Employee("B",75000),
            new Employee("C",90000)
        );

        // TODO: partition by salary > 60000
        Map<Boolean , List<Employee>> ans = list.stream().collect(Collectors.partitioningBy(p->p.getSalary()>6000));
        
    }
}