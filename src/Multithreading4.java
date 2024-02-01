//class Display{
//    public void wish(String name){
//        System.out.println("Thread "+Thread.currentThread().getName()+" entered in wish method");
//        synchronized(this){
//            System.out.println("Thread "+Thread.currentThread().getName()+" starts executing wish method");
//            for (int i=1;i<=10 ;i++ )
//            {
//                System.out.println("Good Morning: "+name);
//                try{
//                    Thread.sleep(10);
//                }
//                catch (InterruptedException e){
//                }
//            }
//        }
//        System.out.println("Thread "+Thread.currentThread().getName()+" finished wish method");
//    }
//}
//class MyThread extends Thread{
//    Display d;
//    String name;
//    MyThread(Display d,String name){
//        this.d=d;
//        this.name=name;
//    }
//    @Override
//    public void run(){
//        d.wish(name);
//    }
//}
//public class Multithreading4 {
//    public static void main(String... args){
//        Display d=new Display();
//        MyThread t1= new MyThread(d,"dhoni");
//        MyThread t2= new MyThread(d,"yuvi");
//        t1.start();
//        t2.start();
//    }
//}