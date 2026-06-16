import java.util.*;

class TwoSum {
    String name;
    int salary;

    TwoSum(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class TwoSum1{
    public static void main(String[] args) {
        List<TwoSum> list = List.of(
            new TwoSum("Kiran", 50000),
            new TwoSum("jeeva", 23000),
            new TwoSum("jegan", 51000),
            new TwoSum("kalees", 22000),
            new TwoSum("depan", 60000)
        );

        list.stream()
            .sorted(Comparator.comparing(e -> e.salary))
            .forEach(System.out::println);
    }
}