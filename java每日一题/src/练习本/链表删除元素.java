package 练习本;

import java.util.LinkedList;

public class 链表删除元素 {
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(4);
        int i = linkedList.indexOf(5);
        linkedList.remove(i);
        System.out.println(linkedList);
    }
}
