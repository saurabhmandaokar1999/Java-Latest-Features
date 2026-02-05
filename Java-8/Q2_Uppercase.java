import java.util.*;

public class Q2_Uppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "stream", "api");

        // TODO: convert to uppercase using map()

        // List<String> ans = names.stream().map(String:: toUpperCase).collect(Collectors.toList());
        // ans.forEach(p->System.out.println(p));
        names.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}