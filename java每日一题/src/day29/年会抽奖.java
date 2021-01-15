package day29;

import java.util.Scanner;

public class 年会抽奖 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            int n = 1;
            for (int i1 = 2; i1 <= i; i1++) {
                n *= i1;
            }
            System.out.println(n);//总数量
            int zhengque = 0;
            for (int i1 = 2; i1 <= i; i1++) {


            }
        }
    }

    public static int c(int n, int m) {
        
    }
}
