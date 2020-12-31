package 测试线程锁;

public class 修复线程安全 {
    static int n = 0;
    static final int count = 100_0000;

    static class Adder extends Thread {
        @Override
        public void run() {
                for (int i = 0; i < count; i++) {
                    synchronized (修复线程安全.class) {

                    n++;
                }
            }
            System.out.println(n);
        }
    }

    static class Suber extends Thread {
        @Override
        public void run() {
                for (int i = 0; i < count; i++) {
                    synchronized (修复线程安全.class) {
                        n--;





                }
            }
            System.out.println(n);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread adder = new Adder();
        Thread suber = new Suber();
        adder.start();
        suber.start();
        Thread.sleep(1000);
        System.out.println("----------");
        System.out.println(n);
    }
}
