package day03;

import java.util.LinkedList;

public class demo {
    public static void main(String[] args) {
        String s = "()[]()()()()";
        boolean b = chkParenthesis(s, s.length());
        System.out.println(b);
    }

    public static boolean chkParenthesis(String A, int n) {
        char[] chars = A.toCharArray();
        LinkedList<Character> linkedlist = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (chars[i] == '(' || chars[i] == ')') {
                if (chars[i] == '(') {
                    linkedlist.add('(');
                } else {
                    if (linkedlist.isEmpty()){
                        return false;
                    }
                    linkedlist.remove();
                }
            } else {
                return false;
            }
        }
        if (linkedlist.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
