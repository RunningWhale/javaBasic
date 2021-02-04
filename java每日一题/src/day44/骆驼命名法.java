package day44;

import java.util.Scanner;

public class 骆驼命名法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String next = sc.next();
            char[] chars = next.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '_') {
                    char c = (char) (chars[i + 1] - 32);
                    sb.append(c);
                    chars[i + 1] = ' ';
                    continue;
                }
                sb.append(chars[i]);
            }
            String s = sb.toString();
            String replace = s.replace(" ", "");
            System.out.println(replace);
        }
    }
}
