package day10;

import java.util.Scanner;

public class Fibonacci数列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f0 = 0;
        int f1 = 1;
        while (f1 <= num) {
            int tmp = f1;
            f1 = f0 + f1;
            f0 = tmp;
        }
        System.out.println(Math.min(num - f0, f1 - num));
    }
}
