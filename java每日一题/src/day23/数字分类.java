package day23;

import java.util.LinkedList;
import java.util.Scanner;

public class 数字分类 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int A1 = 0;
        int A2 = 0;
        int A2Mul = 1;
        int A3 = 0;
        int A4 = 0;
        int A4add = 0;
        int A5 = 0;
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            linkedList.add(n1);
        }
        int[] ints = new int[linkedList.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = linkedList.remove();
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 5 == 0 && ints[i] % 2 == 0) {
                A1 += ints[i];
            }
            if (ints[i] % 5 == 1) {
                A2 += ints[i] * A2Mul;
                A2Mul *= -1;
            }
            if (ints[i] % 5 == 2) {
                A3++;
            }
            if (ints[i] % 5 == 3) {
                A4 += ints[i];
                A4add++;
            }
            if (ints[i] % 5 == 4) {
                if (ints[i] > A5) {
                    A5 = ints[i];
                }
            }
        }
        float a4 = A4;
        if (A1 == 0) {
            System.out.print("N"+" ");
        } else {
            System.out.print(A1 + " ");
        }
        if (A2 == 0) {
            System.out.print("N"+" ");
        } else {
            System.out.print(A2 + " ");
        }
        if (A3 == 0) {
            System.out.print("N"+" ");
        } else {
            System.out.print(A3 + " ");
        }
        if (A4 == 0) {
            System.out.print("N"+" ");
        } else {
            System.out.print(String.format("%.1f", a4 / A4add)+" ");
        }
        if (A5 == 0) {
            System.out.print("N");
        } else {
            System.out.print(A5);
        }
    }
}
