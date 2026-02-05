import java.util.*;
import java.util.stream.Collectors;

public class Q5_Distinct {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,3,4,4,5);

        // TODO: remove duplicates using distinct()
        List<Integer> ans = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(ans);
        
    }
}