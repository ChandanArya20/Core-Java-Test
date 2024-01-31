import java.util.Arrays;
import java.util.List;

public class Collection2 {
    public static void main(String[] args) {

        int[] arr={23,5,6,78,90,12};

//        ArrayList<Integer> lis = new ArrayList<>();
//        for (int e : arr) {
//            lis.add(e);
//        }

        List<Integer> list = Arrays.asList(23, 5, 6, 78, 90, 12);
        List<Integer> lis = List.of(23, 5, 6, 78, 90, 12);


    }
}