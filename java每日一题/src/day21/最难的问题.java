package day21;

import java.util.Scanner;

public class 最难的问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c >= 'F' && c <= 'Z') {
                    c = (char) (c - 5);
                } else if (c >= 'A' && c <= 'E') {
                    switch (c) {
                        case 'A':
                            c = 'V';
                            break;
                        case 'B':
                            c = 'W';
                            break;
                        case 'C':
                            c = 'X';
                            break;
                        case 'D':
                            c = 'Y';
                            break;
                        case 'E':
                            c = 'Z';
                    }
                }
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
