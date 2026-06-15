import java.util.*;
class Main{
    public static void main(String[] args) {
        List<Integer> eve=Arrays.asList(1,2,3,4,5,6,7,8);
        eve.stream()
        .filter(x->x%2==0)
        .forEach(System.out::println);
    }
}