import java.time.LocalTime;

public class Multithreading {

    public static void main(String[] args) throws InterruptedException {

        LocalTime now = LocalTime.now();
        System.out.println(now);

        Thread th1=new Thread(() -> {
                for (int i = 0; i < 1000;i++){
                    System.out.print("-");
                }
        });
        Thread th2=new Thread(() -> {
                for (int i = 0; i < 1000;i++){
                    System.out.print("*");
                }
        });

        th1.start();
        th2.start();

        for (int i = 0; i < 500000;i++){
            System.out.print("#");
        }
        th1.join();
        th2.join();
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().getSecond()-now.getSecond());
    }
}
