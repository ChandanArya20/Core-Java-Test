import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        list.add("Chandan");
        list.add(23);
        list.add('A');
        list.add(34.67);

        System.out.println(list);

        String[] names={"Java","Python","C++"};
        List<String> namesList = Arrays.asList(names);
//        Arrays.asList(names): Returns a fixed-size list backed by the specified array. Changes made to the array
//        will be visible in the returned list, and changes made to the list will be visible
//        in the array. The returned list is Serializable and implements RandomAccess.

        System.out.println(Arrays.toString(names));
        System.out.println(namesList);

        namesList.set(1,"JavaScript");

        System.out.println(Arrays.toString(names));
        System.out.println(namesList);

        namesList.add("C#");

//        int[] arr1={1,2,3,4};
//        List<int[]> list1 = Arrays.asList(arr1);
//
//        Integer[] arr2={1,2,3,4};
//        List<Integer> list2 = Arrays.asList(arr2);


    }
}
