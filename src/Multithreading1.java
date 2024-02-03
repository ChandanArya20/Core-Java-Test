<<<<<<< HEAD
import java.time.LocalTime;

public class Multithreading1 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();


        for (int i = 0; i < 10;i++){
            System.out.print("-");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 10;i++){
            System.out.print("*");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println();
        System.out.println("Time taken "+ (System.currentTimeMillis()-startTime));
    }
}
=======
import java.time.LocalTime;

public class Multithreading1 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();


        for (int i = 0; i < 10;i++){
            System.out.print("-");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 10;i++){
            System.out.print("*");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println();
        System.out.println("Time taken "+ (System.currentTimeMillis()-startTime));
    }
}
>>>>>>> origin/master
