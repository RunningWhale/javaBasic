package day04;

import java.util.LinkedList;
import java.util.Scanner;

public class 买苹果 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int m = num / 6 + 1;
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if ((6 * i + 8 * j) == num) {
                    linkedList.add(i + j);
                }
            }
        }
        if (linkedList.isEmpty()) {
            System.out.println(-1);
            return;
        }
        int min = linkedList.remove();
        while (!linkedList.isEmpty()) {
            Integer remove = linkedList.remove();
            min = remove < min ? remove : min;
        }
        System.out.println(min);
    }
}
