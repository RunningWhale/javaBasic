package day24;

import java.util.Scanner;

public class 小易的升级之路 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int power = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
                if (power >= arr[i]) {
                    power += arr[i];
                } else {
                    power += gcd(power, arr[i]);
                }
            }
            System.out.println(power);
        }
    }

    public static int maxDivisor(int A, int B) {
        int num = 1;
        int n = A < B ? A : B;
        for (int i = 1; i < n; i++) {
            if (A % i == 0 && B % i == 0) {
                num = i;
            }
        }
        return num;
    }
    public static int gcd(int a,int b){
        int tem = 0;
        while(a%b!=0){
            tem = a%b;
            a=b;
            b=tem;
        }
        return b;
    }
}
