package day44;

import java.util.LinkedList;
import java.util.Scanner;

public class 单词倒排 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            LinkedList<String> linkedList = new LinkedList<>();
            String next = sc.nextLine();
            String[] s = next.split(" ");
            for (String s1 : s) {
                linkedList.add(s1);
            }
            StringBuilder stringBuilder=new StringBuilder();
            while (!linkedList.isEmpty()) {
                String last = linkedList.getLast();
                stringBuilder.append(last+" ");
                linkedList.remove(linkedList.size() - 1);
            }
            String s1 = stringBuilder.toString();
            String trim = s1.trim();
            System.out.println(trim);

        }
    }
}
