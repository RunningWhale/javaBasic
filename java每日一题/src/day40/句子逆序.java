package day40;

import java.util.Scanner;

public class 句子逆序 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
//        StringBuilder sb=new StringBuilder();
        for (int i=s1.length-1;i>=0;i--){
//            sb.append(s1[i]);
            System.out.print(s1[i]);
            if (i!=0){
                System.out.print(" ");
            }
        }
    }
}
