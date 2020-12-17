import java.util.Stack;

//给定一个链表，请判断该链表是否为回文结构。
class ListNode {
    int val;
    ListNode next = null;
}

public class Solution {
    public static void main(String[] args) {

    }

    public boolean isPail(ListNode head) {
        ListNode now = head;
        Stack stack = new Stack();
        while (now != null) {
            stack.push(now.val);
            now = now.next;
        }
        now = head;
        while (!stack.isEmpty()) {
            if ((int) stack.pop() != now.val) {
                return false;
            }
            now=now.next;
        }
        return true;
    }
}
