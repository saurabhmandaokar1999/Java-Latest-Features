import java.util.*;

public class Q6_Sum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        // TODO: compute sum using reduce()

        Integer ans = nums.stream().reduce(0,(a,b)->a+b);
        System.out.println(ans);
    }
}