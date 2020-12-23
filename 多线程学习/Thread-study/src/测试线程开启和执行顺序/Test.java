package 测试线程开启和执行顺序;

public class Test {
    public static void main(String[] args) {
        T1 t1=new T1();
        T2 t2=new T2();
        t2.start();
        t1.start();
    }

}
class T1 extends Thread{
    @Override
    public void run() {
        System.out.println("t1");
    }
}
class T2 extends Thread{
    @Override
    public void run() {
        System.out.println("t2");
    }
}