package day30;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class 大整数排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] bigIntegers = new BigInteger[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            bigIntegers[i] = sc.nextBigInteger();
        }
        Arrays.sort(bigIntegers);
        for (BigInteger b:bigIntegers){
            System.out.println(b);
        }
    }
}
