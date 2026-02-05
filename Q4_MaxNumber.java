import java.util.*;

public class Q4_MaxNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 12, 3, 21, 9);

        // TODO: find maximum using streams

        Optional<Integer> ans = nums.stream().max(Comparator.naturalOrder());
        System.out.print(ans.get());
    }
}