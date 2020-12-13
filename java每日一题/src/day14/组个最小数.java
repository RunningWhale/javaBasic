package day14;

import java.util.LinkedList;
import java.util.Scanner;

public class 组个最小数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int j = 0; j < s1.length; j++) {
            for (int i = 0; i < Integer.valueOf(s1[j]); i++) {
                linkedList.add(j);
            }
        }
        int[] arr = new int[linkedList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = linkedList.remove();
        }
        if (arr[0] != 0) {
            for (int i : arr) {
                System.out.print(i);
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    int tmp = arr[i];
                    arr[i] = arr[0];
                    arr[0] = tmp;
                    break;
                }

            }
            for( int i:arr){
                System.out.print(i);
            }
        }
    }
}

