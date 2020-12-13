package day09;

import java.util.LinkedList;
import java.util.Scanner;

public class 数字颠倒 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            linkedList.add(Integer.valueOf(String.valueOf(s.charAt(i))));
        }
        while (!linkedList.isEmpty()){
            System.out.print(linkedList.remove());
        }
    }
}
