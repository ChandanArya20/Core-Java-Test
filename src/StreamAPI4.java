import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI4 {
    public static void main(String[] args) {

        Integer[] arr={12,3,56,90,12,34,10,5,7,30};
        List<Integer> list = List.of(arr);
        System.out.println(list);

        List<Integer> list1 = list.stream()
                .map(e -> e + 10)
                .peek(e -> System.out.println("Mapped element is " + e))
                .filter(e -> e % 2 != 0)
                .peek(e -> System.out.println("Filtered element is " + e))
                .toList();

        System.out.println(list1);
        Optional<Integer> optional = list1.stream().reduce((e1, e2) -> e1 + e2);
        System.out.println(optional);

        System.out.println(list);
        Integer res = list.stream().reduce(100,Integer::sum);
        System.out.println(res);

        System.out.println(list);
        Long count = list.stream().filter(e->e<10).count();
        System.out.println(count);

        System.out.println(list);
        boolean b = list.stream().anyMatch(e -> e == 11);
        System.out.println(b);

        System.out.println(list);
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        Integer max = list.stream()
                .sorted(Comparator.reverseOrder())
                .max((e1, e2) -> e1 - e2)
                .get();
        System.out.println("Max is "+max);

        Integer min = list.stream()
                .sorted(Comparator.reverseOrder())
                .min((e1, e2) -> e1 - e2)
                .get();
        System.out.println("Min is "+min);


    }
}
