package day35;

public class 百万富翁问题 {
    public static void main(String[] args) {
        System.out.print(300);
        int money=0;
        for (int i=0;i<=29;i++){
            money+=Math.pow(2,i);
        }
        System.out.println(" "+money);
    }
}
