package day24;

import java.util.Scanner;

public class 最高分是多少 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int count = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            sc.nextLine();
            for (int i = 0; i < count; i++) {
                String s = sc.nextLine();
                String[] s1 = s.split(" ");
                if (s1[0].equals("Q")) {
                    int max = arr[Integer.valueOf(s1[1]) - 1];
                    if (Integer.valueOf(s1[1]) > Integer.valueOf(s1[2])) {
                        String temp = s1[2];
                        s1[2] = s1[1];
                        s1[1] = temp;
                    }
                    for (int i1 = Integer.valueOf(s1[1]); i1 <= Integer.valueOf(s1[2]); i1++) {
                        max = max > arr[i1 - 1] ? max : arr[i1 - 1];
                    }
                    System.out.println(max);
                } else {
                    arr[Integer.valueOf(s1[1]) - 1] = Integer.valueOf(s1[2]);
                }
            }
        }
    }
}
