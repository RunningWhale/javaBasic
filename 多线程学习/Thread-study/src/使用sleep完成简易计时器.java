public class 使用sleep完成简易计时器 {
    public static void main(String[] args) {


        int remaining=0;
        if (args.length==1){
            remaining=Integer.valueOf(args[0]);
        }
        while (true){
            System.out.println(remaining);
            remaining--;
            if (remaining<0){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
