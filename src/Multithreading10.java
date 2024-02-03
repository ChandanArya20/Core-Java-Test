import java.io.FileInputStream;
import java.io.IOException;
class Counter{
    private int count;

    public void increment(){
        ++count;
    }

    public int getCount(){
        return count;
    }


}

public class Multithreading10 {

    public static void main(String[] args) throws IOException, InterruptedException {

        Counter counter = new Counter();

        Thread th1=new Thread(()->{
            for (int i=0; i<1000; i++){
                counter.increment();
            }
        });

        Thread th2=new Thread(()->{
            for (int i=0; i<1000; i++){
                counter.increment();
            }
        });

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Conut is "+counter.getCount());


    }
}
