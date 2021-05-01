public class solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)  return null;
        for(ListNode x=head;x.next!=null;x=x.next){
            while (x.next!=null&&x.val==x.next.val){
                x.next=x.next.next;
            }
        }
        return head;
    }
}
