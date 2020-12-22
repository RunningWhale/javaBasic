package 定时器;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TimerCallable {
    public static void main(String[] args) {
        //必须传入一个Callable接口实现类对象
        FutureTask futureTask=new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call方法相当于run()只是这个有返回值
                int a=10;
                return a;
            }
        });
        Thread thread=new Thread(futureTask);
        thread.start();
//        Object o= thread.get()
    }
}
