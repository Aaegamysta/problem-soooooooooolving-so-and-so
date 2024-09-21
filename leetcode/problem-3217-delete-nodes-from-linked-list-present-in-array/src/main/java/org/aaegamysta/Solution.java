package org.aaegamysta;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            set.add(i);
        }
        while(set.contains(head.val)) {
            head = head.next;
        }
        var p = head;
        ListNode q = null;
        while(p != null) {
            if(set.contains(p.val)) {
                q.next = p.next;
                p = p.next;
                continue;
            }
            q = p;
            p = p.next;
        }
        return head;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}