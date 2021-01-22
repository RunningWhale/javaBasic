package day36;

import java.util.Scanner;

public class 字母统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] chars = s1.toCharArray();
        int[] arr = new int[26];
        for (char c : chars) {
            if (c >= 'A' && c <= 'Z') {
                int c1 = c;
                arr[c1 - 65]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (i + 65) + ":" + arr[i]);
            System.out.println();
        }
    }
}
