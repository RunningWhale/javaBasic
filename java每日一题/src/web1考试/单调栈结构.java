package web1考试;

import java.util.Scanner;

public class 单调栈结构 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    System.out.print(j + " ");
                    break;
                }
            }
            if (j == -1) {
                System.out.print("-1" + " ");
            }
            j = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    System.out.println(j);
                    break;
                }
            }
            if (j == arr.length) {
                System.out.println("-1");
            }
        }
    }
}
