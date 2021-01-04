package 线程池学习.自定义线程池练习;

public class MyTask implements Runnable{

private int id;

    public MyTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        System.out.println("当前线程"+name+"将执行任务"+id);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程"+name+"完成任务"+id);
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "id=" + id +
                '}';
    }
}
