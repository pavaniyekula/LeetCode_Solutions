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
    public boolean isPalindrome(ListNode head) {
        /*ArrayList<Integer>list=new ArrayList<>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        int left=0;
        int right=list.size()-1;
        while(left<=right)
        {
            if(list.get(left)==list.get(right))
            {
                left++;
                right--;
            }
            else return false;
        }
        return true;*/
        ListNode tempNode=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode reversedNode=reverse(slow.next);
        ListNode first=head;
        ListNode second=reversedNode;
        while(second!=null)
        {
            if(first.val!=second.val)
            {
                reverse(reversedNode);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(reversedNode);
        return true;
    }
    static ListNode reverse(ListNode head)
    {
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}