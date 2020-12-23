import java.util.Random;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        int i = new Random().nextInt(2);
        System.out.println(i);
        Thread thread=new Thread();
        MyRunnable myRunnable=new MyRunnable();
        new Thread(myRunnable).start();
        Thread.sleep(10);
    }
    static class MyRunnable implements Runnable{

        @Override
        public void run() {

        }
    }
}
