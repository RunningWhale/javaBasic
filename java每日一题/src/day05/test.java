package day05;

import java.util.Scanner;

public class test {
    static int[] things;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        things = new int[count];
        for (int i = 0; i < count; i++) {
            things[i] = scanner.nextInt();
        }
        int choose = choose(count, 40);
        System.out.println(choose);
    }

    public static int choose(int n, int cap) {
        if (cap==0) {
            return 1;
        }else if(cap<0|| cap>0 && n==0 ){
            return  0;
        }
        return choose(n - 1, cap) + choose(n - 1, cap - things[n - 1]);
    }
}
