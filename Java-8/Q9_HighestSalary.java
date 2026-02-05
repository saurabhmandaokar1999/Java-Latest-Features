import java.util.*;

public class Q9_HighestSalary {

    static class Employee {
        int id; String name; double salary;
        Employee(int id,String name,double salary){
            this.id=id; this.name=name; this.salary=salary;
        }
        public double getSalary(){ return salary; }
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee(1,"A",50000),
            new Employee(2,"B",90000),
            new Employee(3,"C",7000000)
        );

        // TODO: find highest salary employee

        Optional<Employee> ans = list.stream().max(Comparator.comparing(e->e.getSalary()));
        System.out.println(ans.get().name);
    }
}