package day36;

import java.util.Scanner;

public class 进制转换 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.nextLine();
            s1 = s1.substring(2);
            Integer integer = Integer.valueOf(s1,16);
            System.out.println(integer);
        }
    }
}
