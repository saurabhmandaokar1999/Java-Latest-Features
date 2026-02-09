import java.util.*;

public class Q12_SecondHighest {

    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(50000,90000,70000,90000);

        // TODO: find second highest distinct salary
       Optional<Integer> ans = salaries.stream().distinct().skip(1).findFirst();
       System.out.println(ans.get());
    }
}