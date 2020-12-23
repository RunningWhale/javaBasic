public class 测试多线程安全问题 {
    public static void main(String[] args) {
        MyNum myNum = new MyNum();
        System.out.println(myNum.getNum());
            new Thread(new Runnable() {
                @Override
                public void run() {
                   while (true){
                       int num = myNum.getNum();
                       System.out.println(Thread.currentThread().getName()+"--" +num );
                       try {
                           Thread.sleep(100);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                   while (true){
                       int num = myNum.getNum();
                       System.out.println(Thread.currentThread().getName()+"--" +num);
                       try {
                           Thread.sleep(100);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                }
            }).start();
        System.out.println(myNum.getNum());

    }

    static class MyNum {
        int num ;

        public int getNum() {
            return num++;
        }
    }
}
