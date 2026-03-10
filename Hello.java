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
    public ListNode partition(ListNode head, int x) {
        
        ListNode p1 = new ListNode(0);
        ListNode p2 = new ListNode(0);
        ListNode m1 = p1;
        ListNode m2 = p2 ;

        
        while(head != null){
            ListNode next = head.next ;
            head.next = null;
            if(head.val <x){
                m1.next = head;
               m1 = m1.next  ;
            }else{
                m2.next = head ;
                m2 = m2.next ;
            }
            head = next ;
        }
        
        m1.next = p2.next;
        return p1.next;
        
    }
}