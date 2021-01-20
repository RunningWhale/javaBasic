public class 合并两个有序链表 {

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode prevhead = new ListNode(-1);
            ListNode cur = prevhead;
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    cur.next = l1;
                    cur = cur.next;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    cur = cur.next;
                    l2 = l2.next;
                }
            }
            cur.next = l1 == null ? l2 : l1;
            return prevhead.next;
//用hashset会去重，不可用
            /*HashSet<Integer> hashSet = new HashSet<>();
            while (l1 != null) {
                hashSet.add(l1.val);
                l1 = l1.next;
            }
            while (l2 != null) {
                hashSet.add(l2.val);
                l2 = l2.next;
            }
            Iterator<Integer> iterator = hashSet.iterator();
            Integer next1 = iterator.next();
            ListNode head = new ListNode(next1);
            ListNode cur = head;
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                ListNode node = new ListNode(next);
                cur.next = node;
                cur = cur.next;
            }
            return head;*/
        }
    }

    class ListNode {
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