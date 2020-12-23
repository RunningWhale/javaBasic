package 终止线程;

public class 综合终止线程测试 {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        System.out.println(111);
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();

        System.out.println(222);
    }
}

class T1 extends Thread {
    public boolean flag = true;

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            if (Thread.interrupted()) {
//                break;
//            }
            System.out.println("000");
        }
    }
}
