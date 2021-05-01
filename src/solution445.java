import java.util.Stack;

public class solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        ListNode start1=l1;
        ListNode start2=l2;
        while(start1!=null){
            s1.push(start1.val);
            start1=start1.next;
        }

        while (start2!=null){
            s2.push(start2.val);
            start2=start2.next;
        }

        ListNode res=null;
        int flag=0;
        while (!s1.isEmpty()||!s2.isEmpty()||flag>0){
            int sum=flag;
            sum+=s1.isEmpty()?0:s1.pop();
            sum+=s2.isEmpty()?0:s2.pop();
            ListNode node=new ListNode(sum%10);
            node.next=res;
            res=node;
            flag=sum/10;
        }

        return res;
    }
}
