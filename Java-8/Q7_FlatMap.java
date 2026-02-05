import java.util.*;
import java.util.stream.Collectors;

public class Q7_FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
            Arrays.asList(1,2),
            Arrays.asList(3,4),
            Arrays.asList(5,6)
        );

        // TODO: flatten using flatMap()
        List<Integer> ans = list.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        ans.forEach(p->System.out.println(p));
    }
}