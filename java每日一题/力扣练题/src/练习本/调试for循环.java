package 练习本;

import java.util.LinkedList;

public class 调试for循环 {
    public static void main(String[] args) {
        /*int[] arrs = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }*/
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(2);
        linkedList.clear();
        System.out.println(linkedList);
    }
}
