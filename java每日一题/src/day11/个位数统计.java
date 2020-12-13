package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class 个位数统计 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i),0)+1);
        }
        Iterator<Map.Entry<Character, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }
    }
}
