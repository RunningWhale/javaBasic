package day13;

import java.util.Scanner;

public class 跟奥巴马一起学习编程 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i < Math.round(Integer.parseInt(s1[0]) / 2.0); i++) {
            if (i == 0 || i == Math.round(Integer.parseInt(s1[0]) / 2.0) - 1) {
                for (int j = 0; j < Integer.parseInt(s1[0]); j++) {
                    System.out.print(s1[1]);
                }
            } else {
                for (int j = 0; j < Integer.parseInt(s1[0]); j++) {
                    if (j == 0 || j == Integer.parseInt(s1[0]) - 1) {
                        System.out.print(s1[1]);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
