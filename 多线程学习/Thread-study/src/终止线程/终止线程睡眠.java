package 终止线程;

public class 终止线程睡眠 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadRunnable myThreadRunnable=new MyThreadRunnable();
        Thread thread=new Thread(myThreadRunnable);
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
        System.out.println("---------");

    }
    static class MyThreadRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(11);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(222);
            System.out.println(333);
        }
    }
}
