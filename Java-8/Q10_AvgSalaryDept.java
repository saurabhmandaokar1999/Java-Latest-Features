import java.util.*;
import java.util.stream.Collectors;

public class Q10_AvgSalaryDept {

    static class Employee {
        String name, dept;
        double salary;
        Employee(String n,String d,double s){
            name=n; dept=d; salary=s;
        }
        public String getDept(){ return dept; }
        public double getSalary(){ return salary; }
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("A","IT",60000),
            new Employee("B","IT",80000),
            new Employee("C","HR",50000)
        );

        // TODO: avg salary by department
        Map<String , Double> ans = list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
        
        System.out.println(ans);

    }
}