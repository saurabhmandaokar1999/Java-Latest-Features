import java.util.*;

public class Q1_FilterEven {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 10, 7, 4, 9, 2, 8);

        // TODO: use stream to print even numbers
        
        nums.stream().filter(n->n%2==0).forEach(p->System.out.println(p));
    }
}