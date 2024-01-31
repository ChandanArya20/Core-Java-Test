import java.time.LocalTime;

public class Multithreading1 {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println(now);
        for (int i = 0; i < 1000;i++){
            System.out.print("-");
        }

        for (int i = 0; i < 1000;i++){
            System.out.print("*");
        }

        for (int i = 0; i < 500000;i++){
            System.out.print("#");
        }
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().getSecond()-now.getSecond());

    }
}
