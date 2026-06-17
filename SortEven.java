import java.util.*;
class Main{
    public static void main(String[] args) {
        List<Integer> eve=Arrays.asList(1,5,10,22,30,44,55,67,94,90);
        eve.stream()
        .filter(x->x>50)
        .filter(x->x%5==0)
        .filter(x->x%2==0)
        .forEach(System.out::println);
    }
}