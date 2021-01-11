package day26;

import java.util.Scanner;

public class 数字之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String next = sc.next();
            String[] split = next.split("");
            int num = 0;
            for (int i = 0; i < split.length; i++) {
                num += Integer.valueOf(split[i]);
            }
            int pow = (int) Math.pow(Integer.valueOf(next), 2);
            String s = String.valueOf(pow);
            String[] split1 = s.split("");
            int num2 = 0;
            for (int i = 0; i < split1.length; i++) {
                num2 += Integer.valueOf(split1[i]);
            }
            System.out.println(num + " " + num2);
        }
    }
}
