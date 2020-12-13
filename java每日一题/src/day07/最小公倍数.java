package day07;

import java.util.Scanner;

public class 最小公倍数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int min = A > B ? B : A;
        int max = A > B ? A : B;
        int num;
        while (min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        num = A / max * B;
        System.out.println(num);
    }
}
