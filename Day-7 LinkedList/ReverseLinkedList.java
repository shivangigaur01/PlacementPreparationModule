class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev=null;
        ListNode current=head;
        ListNode last=null;
        while(current!=null){
            last=current.next;
            current.next=prev;
            prev=current;
            current=last;
            
        }
        head=prev;
        return head;
    }
}
