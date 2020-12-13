package day14;

import java.util.Scanner;

public class 尼克彻斯定理 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int i = sc.nextInt();
            String s = GetSequeOddNum(i);
            System.out.println(s);
        }

    }
    public static String GetSequeOddNum(int m){
        int[] arr = new int[m];
        String s="";
        int n = m * m - m + 1;
        for (int j = 0; j < arr.length; j++) {
            arr[j] = n;
            n += 2 ;
        }
        for (int j = 0; j < arr.length; j++) {
            if (j == arr.length - 1) {
                s+=arr[j];
                break;
            }else {
                s+=arr[j] + "+";
            }
        }
        return s;
    }
}
