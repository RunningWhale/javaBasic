package 线程池学习.java内置线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyTest01 {
    public static void main(String[] args) {
        //获取线程池对象
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i=0;i<10;i++){
            executorService.submit(new MyRunnable(i));
        }
    }
}
class MyRunnable implements Runnable{
    private int id;

    public MyRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程执行了"+id);
    }
}
