package day06;

import java.util.*;

public class 出现次数判断 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String replace = s.replace(" ", "");
        int length = replace.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            hashMap.put(replace.charAt(i), hashMap.getOrDefault(replace.charAt(i), 0) + 1);
        }
        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() >= length / 2) {
                System.out.println(entry.getKey());
                return;
            }
        }

    }
}
