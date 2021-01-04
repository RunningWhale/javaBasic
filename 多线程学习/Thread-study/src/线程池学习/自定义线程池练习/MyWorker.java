package 线程池学习.自定义线程池练习;

import java.util.List;

public class MyWorker extends Thread {
    private String name;
    private List<Runnable> tasks;

    public MyWorker(String name,List<Runnable> tasks) {
        super(name);
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (tasks.size() > 0) {
            tasks.remove(0).run();
        }
    }
}
