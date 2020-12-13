package day05;

import java.util.Scanner;

public class 神奇的口袋 {
    static int[] a;
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] things = new int[count];
        int result;
        for (int i = 0; i < count; i++) {
            things[i] = scanner.nextInt();
        }*/
        /*for (int i = 2; i <= count; i++) {
            for (int j = 0; j < count; j++) {
                while (i)
            }
        }*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int choose = choose(n, 40);
        System.out.println(choose);

    }
    public static int choose(int n,int sum){
        if(sum == 0)return 1;
        if(sum > 0 && n < 1)return 0;
        if(sum < 0)return 0;
        return choose(n-1,sum) + choose(n-1,sum-a[n-1]);
    }
}
