package 测试;

public class Test {
    static boolean flag = true;

    static class T1 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag=false;
        }
    }

    static class T2 extends Thread {
        @Override
        public void run() {
            while (true) {
                if (flag=false){
                    break;
                }
                System.out.println("T2");
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T2();
        t1.start();
        t2.start();
    }
}

