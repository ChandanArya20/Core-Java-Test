//import org.w3c.dom.ls.LSOutput;
//
//class ThreadB extends Thread{
//    int total =0;
//    @Override
//    public void run(){
//        for (int i=0;i<=100 ; i++){
//            total+=i;
//        }
//
//        System.out.println("Thread "+Thread.currentThread().getName()+" starts executing below line");
//        for (int i=0;i<10;i++){
//            System.out.println("i "+i);
//        }
//    }
//}
//public class ThreadCommunication2 {
//    public static void main(String[] args)throws InterruptedException {
//        ThreadB b=new ThreadB();
//        b.start();
//        b.join(); //main thread will go in waiting state until b thread finished its execution
//        System.out.println(b.total);
//    }
//}
