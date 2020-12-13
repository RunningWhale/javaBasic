package day17;

import java.util.Arrays;

public class 火车进站 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ziDianSort(arr);
    }

    public static void ziDianSort(int[] arr) {
        int a = arr.length - 2;
        System.out.println(Arrays.toString(arr));
        for (; a >= 0; a--) {
            if (arr[a] < arr[a + 1]) {
                for (int b = arr.length - 1; b > a; b--) {
                    if (arr[b] > arr[a]) {
                        int temp = arr[b];
                        arr[b] = arr[a];
                        arr[a] = temp;
                        Arrays.sort(arr, a + 1, arr.length);
                        System.out.println(Arrays.toString(arr));
                        break;
                    }
                }
                a = arr.length - 1;
            }
        }

        /*for (int i = arr.length-1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                for (int j = arr.length-1; j > i; j--) {
                    if (arr[j] > arr[i]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                    //排序后面的内容
                    Arrays.sort(arr, j, arr.length - 1);
                    System.out.println(Arrays.toString(arr));
//                    for (int k=)
                }
            }
        }*/
    }
}
