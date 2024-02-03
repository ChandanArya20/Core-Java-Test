import java.io.IOException;
class Counterx{
    private int count;

    public synchronized void increment(){
        ++count;
    }
    public int getCount(){
        return count;
    }


}

public class Multithreading11 {

    public static void main(String[] args) throws IOException, InterruptedException {

        Counterx counter = new Counterx();

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
