package day29;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 年会抽奖 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            int n = 1;
            for (int i1 = 2; i1 <= i; i1++) {
                n *= i1;
            }
            System.out.println(n);//总数量
            double zhengque = 0;
            for (int i1 = 1; i1 < i - 1; i1++) {
                zhengque += c(i, i1) * a(i, i - i1);
            }
            zhengque += 1;
            double i1 = zhengque / n;
            DecimalFormat decimalFormat = new DecimalFormat("00.00%");
            String format = decimalFormat.format(i1);
            System.out.println(format);
        }
    }

    public static int c(int n, int m) {
        int fenzi = 1;
        int fenmu = 1;
        for (int i = 0; i < m; i++) {
            fenzi *= n;
            n--;
        }
        for (int i = 0; i < m; i++) {
            fenmu *= m;
            m--;
        }
        return fenzi / fenmu;
    }

    public static int a(int n, int m) {
        int a = 1;
        for (int i = 0; i < m; i++) {
            a *= m;
            m--;
        }
        return a;
    }
}
