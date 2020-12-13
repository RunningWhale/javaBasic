package day06;

import java.util.Scanner;

public class 计算糖果 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(s1[i]);
        }
        int A = (arr[0] + arr[2]) / 2;
        int B = (arr[1] + arr[3]) / 2;
        int C = (arr[3] - arr[1]) / 2;
        if (A - B == arr[0] && B-C==arr[1]&& A+B==arr[2] && B+C==arr[3]){
            System.out.println(A+" "+B +" "+C);
        }else {
            System.out.println("No");
        }
    }
}
