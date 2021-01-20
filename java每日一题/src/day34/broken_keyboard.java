package day34;

import java.util.Scanner;

public class broken_keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s11 = sc.nextLine();
        String s = "";
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!s11.contains(String.valueOf(chars[i]))) {
                String s12 = String.valueOf(chars[i]).toUpperCase();
                if (!s.contains(s12)) {
                    s += s12;
                }
            }
        }
        System.out.println(s);

    }
}
