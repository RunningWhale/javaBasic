public class 测试获取当前线程 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        MyThread myThread1=new MyThread();
//        myThread.start();
//        myThread.sleep(1000);
//        System.out.println(myThread1.isAlive());
        System.out.println(myThread.getState());
    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }

    }
    static class MyThreadRunnable implements Runnable{
        @Override
        public void run() {
        }
        public MyThreadRunnable(){
        }
    }
}
