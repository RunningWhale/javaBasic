package 线程交替输出;

/*
两个线程交替输出:
t1-->1
t2-->2
t1-->3
t2-->4
 */
public class Test {
    public static void main(String[] args) {
        int num = 0;
        T1 t1 = new T1(num);
        T2 t2 = new T2(num);
        t1.setName("t1");
        t2.setName("t2");
        t2.start();
        t1.start();

    }
}

class T1 extends Thread {
    private int num;

    T1(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num % 2 == 0) {
                    num++;
                    System.out.println(Thread.currentThread().getName() + "-->" + num);
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                this.notify();


                /*if (num % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "-->" + num);
                num++;
                notify();*/


            }
        }
    }
}

class T2 extends Thread {
    private int num;

    T2(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num % 2 == 1) {
                    num++;
                    System.out.println(Thread.currentThread().getName() + "-->" + num);

                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                this.notify();
            }
        }
    }
}
