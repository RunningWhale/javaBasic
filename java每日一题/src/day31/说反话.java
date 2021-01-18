package day31;

import java.util.Scanner;

public class 说反话 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] split = s.split(" ");
            for (int i = split.length - 1; i >= 0; i--) {
                System.out.print(split[i]);
                if (i!=0){
                    System.out.print(" ");
                }
            }
        }
    }
}
