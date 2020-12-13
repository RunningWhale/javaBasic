package day13.Test;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String a = scanner.nextLine();

            String b = scanner.nextLine();
            String num = AddLongInteger(a, b);
            System.out.println(num);
        }
    }
    public static String AddLongInteger(String addend, String augend) {

        char[] charsA = addend.toCharArray();
        char[] charsB = augend.toCharArray();
        char[] charsMax;
        char[] charsMin;

        if (charsA.length > charsB.length) {
            charsMax = charsA;
            charsMin = charsB;
        } else {
            charsMax = charsB;
            charsMin = charsA;
        }
        int[] charsC = new int[charsA.length + charsB.length + 1];
        for (int i = 0; i < charsC.length; i++) {
            charsC[i] = 0;
        }
        int i = 0;
        for (; i < charsMin.length; i++) {
            int num = (charsMin[charsMin.length - 1 - i] - '0') + (charsMax[charsMax.length - 1 - i] - '0' + charsC[i]);
            if (num > 9) {
                charsC[i] = num % 10;
                charsC[i + 1] += 1;
            } else {
                charsC[i] = num;
            }
        }
        for (; i < charsMax.length; i++) {
            int num = charsMax[charsMax.length-1-i] - '0' + charsC[i];
            if (num > 9) {
                charsC[i] = num % 10;
                charsC[i + 1] += num / 10;
            } else {
                charsC[i] = num;
            }
        }
        StringBuffer sb = new StringBuffer();
        int j = charsC.length - 1;
        for (; j >= 0; j--) {
            if (charsC[j] == 0) {
                continue;
            } else {
                break;
            }
        }
        for (; j >= 0; j--) {
            sb.append((charsC[j]));
        }
        String s = sb.toString();
        return s;
    }
}
