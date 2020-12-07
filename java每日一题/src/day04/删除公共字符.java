package day04;

import java.util.Scanner;

public class 删除公共字符 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            int j = 0;
            for (; j < s2.length(); j++) {
                if (c==s2.charAt(j)){
                    break;
                }
            }
            if (j==s2.length()){
                sb.append(c);
            }
        }
        String s = sb.toString();
        System.out.println(s);
    }
}
