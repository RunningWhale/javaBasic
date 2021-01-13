package day27;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 整数与IP地址间的转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s2 = sc.nextLine();
        String s10 = sc.nextLine();
        String[] split = s2.split("\\.");
        String s2_10 = "";
        for (int i = 0; i < split.length; i++) {
            String string = Integer.toBinaryString(Integer.valueOf(split[i]));
            while (string.length() < 8) {
                string = "0" + string;
            }
            s2_10 += string;
        }
        System.out.println(Integer.parseInt(s2_10, 2));
        String string = Integer.toBinaryString(Integer.parseInt(s10));
        while (string.length() < 32) {
            string += "0";
        }
        System.out.println(string);
        String[] split1 = string.split("");
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < split1.length; i++) {
            queue.offer(Integer.valueOf(split1[i]));
        }
        String[] arr = new String[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
            for (int j = 0; j < 8; j++) {
                arr[i] += queue.poll();
            }
            String string1 = Integer.toBinaryString(Integer.parseInt(arr[i]));
            System.out.println(string1);
        }

    }
}
