import java.util.*;

public class Q3_CountLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "tiger", "lion", "dog");

        // TODO: count strings with length > 3

       long c =  words.stream().filter(s -> s.length()> 3).count();
       System.out.println(c);
    }
}