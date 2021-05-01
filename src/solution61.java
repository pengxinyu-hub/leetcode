public class solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        int length=0;
        ListNode last=head;
        for (ListNode x=head;x!=null;x=x.next){
            if(x.next==null)  last=x;
            length++;
        }
        if(length==1||length==0)  return head;
        int right=k%length;
        int left=length-right;
        while (left!=0){
            ListNode x=head;
            head=head.next;
            last.next=x;
            last=x;
            x.next=null;
            left--;
        }
        return head;
    }
}
