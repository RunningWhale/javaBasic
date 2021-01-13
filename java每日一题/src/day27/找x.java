package day27;

import java.util.Scanner;

public class 找x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (x == arr[i]) {
                    System.out.println(i);
                    return;
                }
            }
            System.out.println(-1);
        }
    }
}

