package day25;

import java.util.Scanner;

public class 学分绩点 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
        int n = sc.nextInt();
        int[] credits = new int[n];
        double[] scores = new double[n];
        int c = 0;
        double g = 0;
        for (int i = 0; i < n; i++) {
            int credit = sc.nextInt();
            credits[i] = credit;
            c += credit;
        }
        for (int i = 0; i < n; i++) {
            double score = sc.nextInt();
            if (score >= 90 && score <= 100) {
                score = 4;
            } else if (score >= 85) {
                score = 3.7;
            } else if (score >= 82) {
                score = 3.3;
            } else if (score >= 78) {
                score = 3.0;
            } else if (score >= 75) {
                score = 2.7;
            } else if (score >= 72) {
                score = 2.3;
            } else if (score >= 68) {
                score = 2.0;
            } else if (score >= 64) {
                score = 1.8;
            } else if (score >= 60) {
                score = 1;
            } else {
                score = 0;
            }
            g += score * credits[i];
            scores[i] = score;
        }

        double GPA = g / c;
        System.out.printf("%.2f", GPA);
//        }

    }
}
