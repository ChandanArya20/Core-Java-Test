class ThreadB extends Thread{
    int total =0;
    @Override
    public void run(){
        synchronized(this){
            System.out.println("Child thread started calculation");
            for (int i=0;i<=100 ; i++){
                total+=i;
            }
            System.out.println("Child thread trying to give notification");
            this.notify();

            System.out.println("child thread starts executing below line");
            for (int i=0;i<10;i++){
                System.out.println("i "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
public class ThreadCommunication3 {
    public static void main(String[] args)throws InterruptedException {
        ThreadB b=new ThreadB();
        b.start();

        synchronized(b){
            System.out.println("Main thread is calling wait on B object");
            b.wait();
            System.out.println("Main thread got notification");
            System.out.println(b.total);
        }
    }
}