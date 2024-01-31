import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI3 {
    public static void main(String[] args) {

        Integer[] arr={12,3,56,90,12,34,10,5};
        List<Integer> arrList = List.of(arr);

        Integer[] array = arrList.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .distinct()
//                .toArray();
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));

         System.out.println();
         List<Integer> list = arrList.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .toList();
        System.out.println(list);

        System.out.println();
        Set<Integer> set = arrList.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .collect(Collectors.toSet());
        System.out.println(set);


        System.out.println();

        Map<Integer, Integer> map = arrList.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .collect(Collectors.toMap(e -> e, e -> e + 2, (e1,e2)->e2));
        System.out.println(map);






    }
}
