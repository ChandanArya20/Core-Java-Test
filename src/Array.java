import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Array {
    public static void main(String[] args) {

        int[] arr={12,45,6,89,90,3,12,5,50};

        System.out.println(arr);
        System.out.println(arr.hashCode());
        System.out.println(arr.getClass());
        System.out.println(arr.getClass().getName());
        System.out.println(Arrays.toString(arr));

        int[] newArray = Arrays.copyOf(arr, 5);
        int[] newArray1 = Arrays.copyOfRange(arr, 2, 7);
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(newArray1));

        System.out.println(Arrays.binarySearch(arr,90));


//        Arrays.fill(arr,0);
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        String[] strArr={"chandan","ram","Ankush","Shivam"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(strArr));

        int[] array1 = Arrays.stream(arr).filter(e->e>5).toArray();
        System.out.println(Arrays.toString(array1));

        System.out.println("Ram");


    }
}