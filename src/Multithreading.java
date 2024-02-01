import java.time.LocalTime;

public class Multithreading {

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        Thread th1=new Thread(() -> {
            for (int i = 0; i < 10;i++){
                System.out.print("-");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread th2=new Thread(() -> {
            for (int i = 0; i < 10;i++){
                System.out.print("*");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        th1.start();
        th2.start();

        th1.join();
        th2.join();
        System.out.println();
        System.out.println("Time taken "+ (System.currentTimeMillis()-startTime));
    }
}
