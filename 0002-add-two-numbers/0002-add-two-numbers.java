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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0;
        ListNode h1=l1; ListNode h2=l2; ListNode head=new ListNode(0);
        ListNode h3=head;
        while(h1!=null && h2!=null){
            int sum=h1.val+h2.val+c;
            c=sum/10;
            sum=sum%10;
            h3.next=new ListNode(sum);
            h3=h3.next;
            h1=h1.next; h2=h2.next;
        }
        while(h1!=null){
            int sum=h1.val+c;
            c=sum/10;
            sum=sum%10;
            h3.next=new ListNode(sum);
            h3=h3.next;
            h1=h1.next;
        }
        while(h2!=null){
            int sum=h2.val+c;
            c=sum/10;
            sum=sum%10;
            h3.next=new ListNode(sum);
            h3=h3.next;
            h2=h2.next;
        }
        if(c!=0){
            h3.next=new ListNode(c);
        }
        return head.next;
    }
}