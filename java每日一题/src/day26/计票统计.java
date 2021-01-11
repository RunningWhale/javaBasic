package day26;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class 计票统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int people = sc.nextInt();
            String[] names = new String[people];
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < people; i++) {
                String next = sc.next();
                hashMap.put(next, 0);
                names[i]=next;
            }
            int toupiaorenshu = sc.nextInt();
            Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
            int Invalid = 0;
            boolean f = false;
            for (int i = 0; i < toupiaorenshu; i++) {
                String next = sc.next();
                for (Map.Entry<String, Integer> h :
                        hashMap.entrySet()) {
                    if (next.equals(h.getKey())) {
                        hashMap.put(h.getKey(), h.getValue() + 1);
                        f = true;
                        break;
                    }
                }
                if (f == false) {
                    Invalid++;
                }
                f = false;
            }
            Set<Map.Entry<String, Integer>> entries1 = hashMap.entrySet();
            for (int i=0;i<people;i++){
                System.out.println(names[i]+ " : " + hashMap.get(names[i]));
            }
                System.out.println("Invalid"+" : "+Invalid);
            
        }
    }
}
