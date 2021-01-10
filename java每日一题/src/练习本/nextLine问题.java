package 练习本;

import java.util.Scanner;

public class nextLine问题 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String next = sc.next();
        sc.nextLine();
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println(s1);
        System.out.println(s);
        System.out.println(next);
    }
}
