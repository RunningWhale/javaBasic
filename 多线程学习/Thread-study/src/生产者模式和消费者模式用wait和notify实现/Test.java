package 生产者模式和消费者模式用wait和notify实现;

import java.util.ArrayList;
import java.util.List;

/*
仓库用List存储，最多存储一个，
生产线程负责生产，消费线程负责消费，这种特殊的业务需求需要使用wait和notify实现
 */
public class Test {
    public static void main(String[] args) {
        //创建一个共享的仓库
        List list = new ArrayList();
        //创建生产者线程
        Thread producer = new Thread(new Producer(list));
        //创建消费者线程
        Thread consumer = new Thread(new Consumer(list));
        producer.setName("生产者线程");
        consumer.setName("消费者线程");

        producer.start();
        consumer.start();
    }
}

//生产线程
class Producer implements Runnable {
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() > 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这里说明仓库空了
                Object o = new Object();
                list.add(o);
                System.out.println(Thread.currentThread().getName() + "-->" + o);
                list.notify();
            }
        }
    }
}

//消费线程
class Consumer implements Runnable {
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() == 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这里说明仓库满了
                Object o = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "-->" + o);
                list.notify();


            }
        }
    }
}