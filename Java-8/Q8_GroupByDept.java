import java.util.*;
import java.util.stream.Collectors;

public class Q8_GroupByDept {

    static class Employee {
        int id;
        String name;
        String dept;
        double salary;

        Employee(int id, String name, String dept, double salary) {
            this.id = id;
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }

        public String getDept() { return dept; }
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee(1,"A","IT",60000),
            new Employee(2,"B","HR",50000),
            new Employee(3,"C","IT",70000)
        );

        // TODO: group employees by department

        Map<String, List<Employee>> ans = list.stream().collect(Collectors.groupingBy(Employee::getDept));
        for(String e : ans.keySet()){
            List<Employee> E = ans.get(e);
            System.out.println(e);
            E.forEach(p->System.out.println(p.name));
        }
        
    }
}