package 线程池学习.自定义线程池练习;

public class MyTest {
    public static void main(String[] args) {
        MyThreadPool myThreadPool=new MyThreadPool(2,4,20);
        for (int i=0;i<20;i++){
            MyTask myTask=new MyTask(1);
            myThreadPool.submit(myTask);
        }
    }
}
