package day08;

import java.util.LinkedList;
import java.util.Scanner;

public class n个数里最小的k个 {
    public static void main(String[] args) {
//        int[] arr = {6, 9, 1, 3, 7, 4, 6, 2};
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (scanner.hasNext()) {
            linkedList.add(scanner.nextInt());
        }
        int[] arr = new int[linkedList.size()-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = linkedList.remove();
        }
        int k=linkedList.peek();
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i=0;i<k;i++){
            System.out.print(arr[i]);
        }
    }
}
