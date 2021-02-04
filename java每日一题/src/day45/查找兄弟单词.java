package day45;

import java.util.HashSet;
import java.util.Scanner;

public class 查找兄弟单词 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        HashSet hashSet=new HashSet();
        for (int i=0;i<num;i++){
            String next = sc.next();
            hashSet.add(next);
        }
    }
}
