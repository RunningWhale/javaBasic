package day27;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 整数与IP地址间的转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
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
            BigInteger bigInteger=new BigInteger(s2_10,2);
            System.out.println(bigInteger);
            BigInteger bigInteger1 = new BigInteger(s10);
            String string =bigInteger1.toString(2);
            while (string.length() < 32) {
                string = "0"+string;
            }
            String[] split1 = string.split("");
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < split1.length; i++) {
                queue.offer(Integer.valueOf(split1[i]));
            }
            String[] arr = new String[4];
            String result = "";
            for (int i = 0; i < arr.length; i++) {
                arr[i] = "";
                for (int j = 0; j < 8; j++) {
                    arr[i] += queue.poll();
                }

                String i1 = String.valueOf(new BigInteger(arr[i],2));
                result += i1;
                if (i != 3) {
                    result += ".";
                }
            }
            System.out.println(result);
        }

    }
}
