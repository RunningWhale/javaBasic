public class 两两交换链表中的节点 {
    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(-1);
            dummy.next=head;
            ListNode cur = dummy;
            while (cur.next != null && cur.next.next != null) {
                ListNode node1=cur.next;
                ListNode node2=cur.next.next;
                cur.next=node2;
                node1.next=node2.next;
                node2.next=node1;
                cur=node1;
            }
            return dummy.next;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
