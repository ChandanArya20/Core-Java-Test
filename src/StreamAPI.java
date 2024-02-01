import java.util.*;

public class StreamAPI {
    public static void main(String[] args) {

       Map<String,Integer> person= new HashMap<>();

       person.put("Chandan",21);
       person.put("Sianit",22);
       person.put("Bhushan",23);
       person.put("Biru",23);
       person.put("Tanu",16);
       person.put("Bhulai",15);
       person.put("Golu",14);


        for (Map.Entry<String, Integer> entry : person.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println();

        person.entrySet().stream()
                .filter(e->e.getValue()%2==0)
                .sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
//                .forEach(System.out::println);
                .forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));



    }
}
