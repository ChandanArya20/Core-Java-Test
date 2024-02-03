import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Multithreading9 {

    public static void main(String[] args) throws IOException, InterruptedException {

        long startTime = System.currentTimeMillis();

        Thread th1=new Thread(() -> {
            try (FileInputStream inputStream = new FileInputStream("src/SANAM TERI KASAM Full Movie.mp4")) {
                byte[] bytes1 = inputStream.readAllBytes();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

//        Thread th2=new Thread(() -> {
//            try (FileInputStream inputStream = new FileInputStream("src/SANAM TERI KASAM Full Movie.mp4")) {
//                byte[] bytes1 = inputStream.readAllBytes();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        });


        Thread th3=new Thread(() -> {
            try(FileInputStream inputStream = new FileInputStream("src/webapp.mp4");){
                byte[] bytes2 = inputStream.readAllBytes();
            } catch(Exception e){
                throw new RuntimeException(e);
            }
        });

        th1.start();
//        th2.start();
        th3.start();

        th1.join();
//        th2.join();
        th3.join();

        System.out.println("Total Time taken "+ (System.currentTimeMillis()-startTime)+" millis");

    }
}
