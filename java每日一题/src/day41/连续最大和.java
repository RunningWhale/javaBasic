package day41;

import java.util.Scanner;

public class 连续最大和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                max = sum > max ? sum : max;
            }
        }
        System.out.println(max);
    }
}
