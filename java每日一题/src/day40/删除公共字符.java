package day40;

import java.util.Scanner;

public class 删除公共字符 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char[] chars = s1.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (char c:chars){
            if (!s2.contains( String.valueOf(c) )){
                sb.append(String.valueOf(c));
            }
        }
        System.out.println(sb.toString());
    }

}
