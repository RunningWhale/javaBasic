package day39;

import java.util.Scanner;

public class 回文串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String next = sc.next();
            int length = next.length();
            int i;
            for (i = 0; i < length; i++) {
                String s = next.substring(0, i) + next.substring(i + 1);
                boolean judge = judge(s);
                if (judge == true) {
                    System.out.println("YES");
                    break;
                }
            }
            if (i == length) {

                System.out.println("NO");
            }
        }

    }

    public static boolean judge(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
