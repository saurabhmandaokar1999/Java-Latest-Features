import java.util.*;
import java.util.stream.*;

public class Q14_Top3 {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(10,40,30,50,20,60);

        // TODO: print top 3 highest salaries
        List<Integer> ans = salaries.stream().distinct().sorted((a,b)->Integer.compare(b,a)).limit(3).collect(Collectors.toList());
        
    }
}