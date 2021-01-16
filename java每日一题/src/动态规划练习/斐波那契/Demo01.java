package 动态规划练习.斐波那契;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            int feibo = feibo(i);
            System.out.println(feibo);
        }
    }

    public static int feibo(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return feibo(i - 1) + feibo(i - 2);
        }
    }
}
