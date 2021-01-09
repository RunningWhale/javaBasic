package day22;

import java.util.Scanner;

public class 到底买不买 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int need = 0;
            boolean flag = false;
            String next = sc.next();
            String buy = sc.next();
            for (int i = 0; i < buy.length(); i++) {
                for (int j = 0; j < next.length(); j++) {
                    if (buy.substring(i, i + 1).equals(next.substring(j, j + 1))) {
                        next = next.substring(0, j)+ next.substring(j + 1);
                        flag = true;
                        break;
                    }
                }
                if (flag == true) {
                    flag = false;
                } else {
                    need++;
                }
            }
            if (need > 0) {
                System.out.println("No" + " " + need);
            } else {
                System.out.println("Yes" +" " + next.length());
            }
        }

    }
}
