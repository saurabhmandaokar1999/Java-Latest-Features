import java.util.*;

public class Q13_Joining {

    static class Employee {
        String name;
        Employee(String n){ name=n; }
        public String getName(){ return name; }
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("A"),
            new Employee("B"),
            new Employee("C")
        );

        // TODO: join names using Collectors.joining
        
    }
}