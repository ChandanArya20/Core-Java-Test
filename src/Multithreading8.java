import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Multithreading8 {

    public static void main(String[] args) throws IOException {

        long startTime1 = System.currentTimeMillis();
        try (FileInputStream inputStream = new FileInputStream("src/SANAM TERI KASAM Full Movie.mp4");) {
            byte[] bytes1 = inputStream.readAllBytes();
        }
        System.out.println("Time taken by first file " + (System.currentTimeMillis() - startTime1) + " millis");


        long startTime2 = System.currentTimeMillis();
        try (FileInputStream inputStream = new FileInputStream("src/webapp.mp4")) {
            byte[] bytes2 = inputStream.readAllBytes();

            System.out.println("Time taken second file " + (System.currentTimeMillis() - startTime2) + " millis");


            System.out.println("Total Time taken " + (System.currentTimeMillis() - startTime1) + " millis");

        }
    }
}
