package 死锁;

public class DeadLock {
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2 = new Object();
        Thread thread=new MyThread1(o1,o2);
        Thread thread1=new MyThread2(o1,o2);
        thread.start();
        thread1.start();
    }

    static class MyThread1 extends Thread {
        private Object o1;
        private Object o2;

        @Override
        public void run() {
            synchronized (o1) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {

                }
            }
        }

        public MyThread1(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }

    }

    static class MyThread2 extends Thread {
        private Object o1;
        private Object o2;

        public MyThread2(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }

        @Override
        public void run() {
            synchronized (o2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {

                }
            }
        }
    }

}
