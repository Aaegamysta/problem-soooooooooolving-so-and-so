package org.aaegamysta;

import java.math.BigInteger;
import java.util.Stack;

public class Solution {
    private Stack<ImmutableListNode> stack;
    public void printLinkedListInReverse(ImmutableListNode head) {
        this.stack = new Stack<ImmutableListNode>();
        while(head.getNext() != null) {
            stack.push(head.getNext());
        }
        while(!stack.empty()) {
            stack.pop().printValue();
        }
    }
}

class ListNode implements ImmutableListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public void printValue() {
       if(this.next == null) {
           return;
       }
       this.printValue();
        System.out.println(this.val);
    }

    @Override
    public ImmutableListNode getNext() {
        return this.next;
    }
}