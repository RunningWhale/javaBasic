package day03;

import java.util.Scanner;

public class 连续最长的字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        char[] chars = next.toCharArray();
        StringBuilder sb = new StringBuilder();
        String str = new String();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                if (sb.length() == 0) {
                    sb.append(chars[i]);
                } else {
                    if (chars[i] - chars[i - 1] == 1) {
                        sb.append(chars[i]);
                    } else {
                        if (str.length()<sb.length()){
                            str = sb.toString();
                        }
                        int length = sb.length();
                        sb.delete(0, length);
                    }
                }
            }else {
                if (sb.length()>str.length()){
                    str=sb.toString();
                }
                    int length = sb.length();
                    sb.delete(0, length);
            }
            if (sb.length()>str.length()){
                str=sb.toString();
            }
        }
        System.out.println(str);
    }
}
