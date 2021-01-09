package day22;

public class 链式A和B {
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        ListNode curA = a;
        int curAMul = 1;
        int resultA = 0;
        int resultB = 0;
        int curBMul = 1;
        ListNode curB = b;
        while (curA != null) {
            resultA += curA.val * curAMul;
            curA = curA.next;
            curAMul *= 10;
        }
        while (curB != null) {
            resultB += curB.val * curBMul;
            curB = curB.next;
            curBMul *= 10;
        }
        int result = resultA + resultB;
        String resultString = String.valueOf(result);
        ListNode listNode = new ListNode(Integer.valueOf(resultString.substring(resultString.length() - 1)));
        ListNode cur=listNode;
        resultString = resultString.substring(0, resultString.length() - 1);
        while (resultString.length()!=0){
            ListNode curnode=new ListNode(Integer.valueOf(resultString.substring(resultString.length() - 1)));
            cur.next=curnode;
            cur=curnode;
            resultString = resultString.substring(0, resultString.length() - 1);

        }
        return listNode;

    }
}
