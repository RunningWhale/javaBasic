package day16;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class 洗牌牛客 {
    public static void main(String[] args) {
        LinkedList<Integer> zongPaiShu = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            zongPaiShu.add(sc.nextInt());
        }
        Integer first = zongPaiShu.removeFirst();
        //根据第一个输入数字判断有几组数据并创建几个数组存放牌
        while (!zongPaiShu.isEmpty()) {
            Integer n = zongPaiShu.remove();//这组牌的数量
            Integer k = zongPaiShu.remove();//这组要洗牌的次数
            int[] arr = new int[2 * n];//这组牌
            for (int i = 0; i < arr.length; i++) {
                arr[i] = zongPaiShu.remove();
            }
            xiPai(arr, k);
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    System.out.println(arr[i]);
                } else {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    //洗牌函数
    public static void xiPai(int[] arr, int k) {
        Stack<Integer> newPai = new Stack<>();
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();

        for (int j = 0; j < k; j++) {
            int i = 0;
            for (; i < arr.length / 2; i++) {
                left.push(arr[i]);
            }
            for (; i < arr.length; i++) {
                right.push(arr[i]);
            }
            while (!left.empty()) {
                newPai.push(right.pop());
                newPai.push(left.pop());
            }
            for (int m=0; m <arr.length; m++) {
                arr[m] = newPai.pop();
            }
        }
        /*int[] newArr = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            newArr[j] = arr[arr.length - j - 1];
        }*/
        /*for (int j = 0; j < arr.length; j++) {
            arr[j] = newArr[j];
        }*/


    }
}
