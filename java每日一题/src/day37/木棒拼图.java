package day37;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 木棒拼图 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            String[] s = s1.split(" ");
            if (s[0].equals("1")) {
                list.add(Integer.valueOf(s[1]));
            } else {
                int i1 = list.indexOf(Integer.valueOf(s[1]));
                list.remove(i1);
            }
            func(list);
        }
    }

    public static void func(List<Integer> list) {
        if (list.isEmpty() || list.size() < 3) {
            System.out.println("No");
            return;
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        sum -= max;
        if (max >= sum) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }


    }
}
