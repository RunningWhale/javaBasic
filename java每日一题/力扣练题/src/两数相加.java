public class 两数相加 {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode();
            ListNode cur = dummy;
            int jinwei = 0;
            while (l1 != null || l2 != null) {
                int num = 0;
                if (l1 != null) {
                    num += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    num += l2.val;
                    l2 = l2.next;
                }
                num += jinwei;
                cur.next = new ListNode(num % 10);
                jinwei = num / 10;
                cur = cur.next;
            }
            if (jinwei > 0) {
                cur.next = new ListNode(jinwei);
            }
            return dummy.next;



            /*String n1 = "";
            String n2 = "";
            while (l1 != null) {
                n1 += l1.val;
                l1 = l1.next;
            }
            while (l2 != null) {
                n2 += l2.val;
                l2 = l2.next;
            }
//            Stack<String> stack = new Stack<>();
            String[] split = n1.split("");
            String n11 = "";
            for (int i = split.length - 1; i >= 0; i--) {
                n11 += split[i];
            }
            String[] split1 = n2.split("");
            String n22 = "";
            for (int i = split1.length - 1; i >= 0; i--) {
                n22 += split1[i];
            }
            int i = Integer.valueOf(n11) + Integer.valueOf(n22);
            String s = String.valueOf(i);
            String[] split2 = s.split("");
            ListNode head = new ListNode(Integer.valueOf(split2[split2.length - 1]));
            ListNode cur = head;
            for (int i1 = split2.length - 2; i1 >= 0; i1--) {
                ListNode listNode = new ListNode(Integer.valueOf(split2[i1]));
                cur.next = listNode;
                cur = listNode;
            }
            return head;*/
        }
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
