package day34;

import java.util.Scanner;

public class 球的半径和体积 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String[] chars = s1.split(" ");
            int x0 = Integer.valueOf(chars[0]);
            int x1 = Integer.valueOf(chars[1]);
            int x2 = Integer.valueOf(chars[2]);
            int y0 = Integer.valueOf(chars[3]);
            int y1 = Integer.valueOf(chars[4]);
            int y2 = Integer.valueOf(chars[5]);
            double pi = Math.PI;
            double banjing = Math.sqrt(Math.pow(x0 - y0, 2) + Math.pow(x1 - y1, 2) + Math.pow(x2 - y2, 2));
            double tiji = 4 / 3.0 * pi * Math.pow(banjing, 3);
            System.out.printf("%.3f", banjing);
            System.out.print(" ");
            System.out.printf("%.3f", tiji);
        }
    }
}
