/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) { //this node is the given node which we have to delete.
        node.val= node.next.val;
        node.next=node.next.next;
    }
}
