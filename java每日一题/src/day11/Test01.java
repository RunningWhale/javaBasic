package day11;

import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,null);
        hashMap.put(1,"123");
        System.out.println(hashMap);
        System.out.println(hashMap.size());
    }
}
