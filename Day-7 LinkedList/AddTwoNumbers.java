class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
       
        while(l1!=null || l2!=null || carry==1){
             int sum=0;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            sum=sum+carry;
            carry=sum/10;
            ListNode n=new ListNode(sum%10);
            temp.next=n;
            temp=temp.next;
        }
        return dummy.next;
    }
}
