package org.aaegamysta;


import java.util.Stack;

// So the idea is to carry out the solution in three discrete separate steps:
// 1. Traverse it normally , and we will get the last element on the top of the stack and last element on the top
// 2. Traverse it recursively, and we will get the first element at the top of the stack and the last element on the bottom
// 3. Pop the elements from both stacks simultaneously and once the stack pointers do not point to the same element, they are not equal
public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        var p1 = head;
        var p2 = head;
        this.recursiveTraverse(stack1, p1);
        this.traverse(stack2, p2);
        while(!stack1.empty() && !stack2.empty()) {
            var n1 = stack1.pop();
            var n2 = stack2.pop();
            if(n1 != n2) {
                return false;
            }
        }
        return true;
    }
    public void traverse(Stack<Integer> stack, ListNode node) {
        while(node != null) {
            stack.push(node.val);
            node = node.next;
        }
    }

    public void recursiveTraverse(Stack<Integer> stack, ListNode node) {
        if(node == null) {
           return;
        } else {
            var p = node;
           recursiveTraverse(stack, node.next);
            stack.push(p.val);
        }
    }
}
