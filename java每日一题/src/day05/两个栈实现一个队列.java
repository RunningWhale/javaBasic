package day05;

import java.util.Stack;

public class 两个栈实现一个队列 {

}

 class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if (stack2.isEmpty()) {
            stack2.push(node);
        } else {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            stack2.push(node);
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public int pop() {
        return stack2.pop();
    }
}