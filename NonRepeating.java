import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeating {
    public static void main(String[] args) {
        String str="swiss";
        //  for (int i = 0; i < str.length(); i++) {
        //     int count = 0;
        //     for (int j = 0; j < str.length(); j++) {
        //         if (str.charAt(i) == str.charAt(j)) {
        //             count++;
        //         }
        //     }
        //     if (count == 1) {
        //         System.out.println(str.charAt(i));
        //         break;
        //     }
        // }

        // for (char ch : str.toCharArray()) {
        //     if (str.indexOf(ch) == str.lastIndexOf(ch)) {
        //         System.out.println(ch);
        //         break;
        //     }
        // }
        str.chars()
           .mapToObj(c -> (char)c)
           .collect(Collectors.groupingBy(
                   Function.identity(),
                   LinkedHashMap::new,
                   Collectors.counting()))
           .entrySet()
           .stream()
           .filter(e -> e.getValue() == 1)
           .findFirst()
           .ifPresent(e -> System.out.println(e.getKey()));
    }
}
