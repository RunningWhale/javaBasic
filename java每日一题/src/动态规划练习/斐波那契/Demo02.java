package 动态规划练习.斐波那契;

import java.util.Scanner;

public class Demo02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i1 = sc.nextInt();
            int[] arr = new int[i1 + 1];
            arr[1] = 1;
            arr[2] = 1;
            for (int i = 3; i < i1 + 1; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println(arr[i1]);
        }
    }
}
