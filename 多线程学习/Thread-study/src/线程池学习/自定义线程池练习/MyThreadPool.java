package 线程池学习.自定义线程池练习;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyThreadPool {
    private List<Runnable> tasks = Collections.synchronizedList(new LinkedList<>());
    private int num;
    private int corePoolSize;
    private int maxSize;
    private int workSize;

    public MyThreadPool(int corePoolSize, int maxSize, int workSize) {
        this.corePoolSize = corePoolSize;
        this.maxSize = maxSize;
        this.workSize = workSize;
    }

    public void submit(Runnable r) {
        if (tasks.size() >= workSize) {
            System.out.println(r + "被丢弃了");
        } else {
            tasks.add(r);
            execTask(r);
        }
    }

    private void execTask(Runnable r) {
        if (num < corePoolSize) {
            new MyWorker("核心线程" + num, tasks).start();
            num++;
        } else if (num < maxSize) {
            new MyWorker("非核心线程" + num, tasks).start();
            num++;
        } else {
            System.out.println("任务" + r + "被缓存了");
        }
    }
}
