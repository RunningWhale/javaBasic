package 定时器;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws ParseException {
        //定义时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse("2020-12-22 19:06:40");
        //创建定时器对象
        Timer timer = new Timer();
        //        Timer timer=new Timer(true);守护线程的方式
        //注意定时任务TimerTask是抽象类，需要单独写定时任务类对象,第一个参数是定时任务对象，第二个是执行时间，第三个是多久间隔执行一次
        timer.schedule(new DingShi(), parse);


        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("这是匿名内部类的方法");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, parse);
        System.out.println("main");
    }
}
class DingShi extends TimerTask {
    @Override
    public void run() {
        System.out.println("定时器执行任务");

    }
}
