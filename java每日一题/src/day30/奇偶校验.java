package day30;

import java.util.Scanner;

public class 奇偶校验 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNext()) {
            s += sc.next();
        }
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            char c = split[i].toCharArray()[0];
            byte b = (byte) c;
            String string = Integer.toBinaryString(b);
            while (string.length() < 7) {
                string = "0" + string;
            }
            int count = 0;
            String[] split1 = string.split("");
            for (String s1 : split1) {
                if (s1.equals("1")) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                string = "1" + string;
            } else {
                string = "0" + string;
            }
            System.out.println(string);
        }

    }
}
