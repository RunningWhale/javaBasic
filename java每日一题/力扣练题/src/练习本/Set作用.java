package 练习本;

import java.util.HashSet;
import java.util.Set;

public class Set作用 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        System.out.println(set);
    }
}
