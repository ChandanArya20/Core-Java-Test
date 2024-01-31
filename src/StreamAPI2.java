import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class StreamAPI2 {
    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(12, 4, 56, 78, 90, 45, 34);
        integerStream.forEach(System.out::println);

        System.out.println();

        Integer[] intArr={5,67,89,90,23,24,10};
        Stream<Integer> intArr1 = Stream.of(intArr);
        intArr1.forEach(System.out::println);


        Stream.generate(()->new Random().nextInt(10000)).limit(10).forEach(System.out::println);

        System.out.println();
        Stream.iterate(10,i->++i).limit(10).forEach(System.out::println);

    }
}
