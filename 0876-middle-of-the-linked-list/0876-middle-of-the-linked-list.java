/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int length=0;
        ListNode temp=head;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        int mid=(length/2)+1;
        for(int i=1;i<mid;i++)
        {
            head=head.next;
        }
        return head;
    }
}