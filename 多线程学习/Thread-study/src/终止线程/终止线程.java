package 终止线程;

public class 终止线程 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        myThread.start();
        Thread.sleep(2000);
        myThread.flag=false;
    }
    static class MyThread extends Thread{
        boolean flag=true;
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                if (flag){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    return;
                }
            }
        }
    }
}
