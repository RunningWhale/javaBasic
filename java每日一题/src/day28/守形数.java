package day28;

import java.util.Scanner;

public class 守形数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int i = sc.nextInt();
            String  is=String.valueOf(i);
            String s=String.valueOf(i*i);
            int i1 = s.length() - is.length() ;
            String substring = s.substring(i1);
            if (substring.equals(is)){
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }
    }
}
