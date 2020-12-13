package day17;

import java.util.Arrays;
import java.util.Scanner;

public class 火车进站最终 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            ziDianSort(arr);
        }
    }

    public static void ziDianSort(int[] arr) {
        int a = arr.length - 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (; a >= 0; a--) {
            if (arr[a] < arr[a + 1]) {
                for (int b = arr.length - 1; b > a; b--) {
                    if (arr[b] > arr[a]) {
                        int temp = arr[b];
                        arr[b] = arr[a];
                        arr[a] = temp;
                        Arrays.sort(arr, a + 1, arr.length);
                        for (int i = 0; i < arr.length; i++) {
                            System.out.print(arr[i]+" ");
                        }
                        System.out.println();
                        break;
                    }
                }
                a = arr.length - 1;
            }
        }

    }
}
