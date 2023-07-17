

class Solution {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverse(ListNode head){
        ListNode temp = null ; 
        while(head != null){ 
            ListNode n = head.next ;
            head.next = temp ;
            temp = head ;
            head = n ;
        } 
            return temp ;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverse(l1) ;
        ListNode head2 = reverse(l2) ;
        ListNode dummy =  new ListNode() ;
        dummy.val = 0 ; 
        int carry = 0 ;
        ListNode temp = dummy ;
        while(head1 != null && head2 != null){
            int sum = carry + head1.val + head2.val ;
            carry = sum/10 ;
            ListNode node = new ListNode();
            node.val = sum % 10 ;
            temp.next = node ;
            temp = temp.next ;
            head1 = head1.next ;
            head2 = head2.next ;
        }
        while( head1 != null ){
            int sum = head1.val + carry ;
            carry = sum/10;
            ListNode node = new ListNode();
            node.val = sum % 10 ;
            temp.next = node ;
            temp = temp.next ;
            head1 = head1.next ;
        }
        while( head2 != null ){
            int sum = head2.val + carry ;
            carry = sum/10;
            ListNode node = new ListNode();
            node.val = sum % 10 ;
            temp.next = node ;
            temp = temp.next ;
            head2 = head2.next ;
        }
        if(carry == 1){
            ListNode node = new ListNode();
            node.val = 1 ;
            temp.next = node ;
            temp = temp.next ;
        }
        temp.next = null ;
        temp = dummy.next ;
        temp = reverse(temp) ;
        return temp ;
    }
}