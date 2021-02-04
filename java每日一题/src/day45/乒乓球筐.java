package day45;

import java.util.LinkedList;
import java.util.Scanner;

public class 乒乓球筐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            LinkedList<Character> linkedListA = new LinkedList<>();
//            LinkedList<Character> linkedListB = new LinkedList<>();
            char[] charsA = a.toCharArray();
//            char[] charsB = b.toCharArray();
            for (char c : charsA) {
                linkedListA.add(c);
            }
            int i;
            for (i = 0; i < b.length(); i++) {
                if (linkedListA.contains(b.charAt(i))) {
                    linkedListA.remove(linkedListA.indexOf(b.charAt(i)));
                } else {
                    System.out.println("No");
                    break;
                }
            }
            if (i == b.length()) {
                System.out.println("Yes");
            }
        }
    }
}
