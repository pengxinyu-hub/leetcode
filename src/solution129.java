public class solution129 {
    private int sum=0;
    public int sumNumbers(TreeNode root) {
        search(root,0);
        return sum;
    }

    private void search(TreeNode node,int cur){
        if(node==null)  return;
        cur=cur*10+node.val;
        if(node.left==null&&node.right==null){
            sum+=cur;
        }
        else {
            search(node.left,cur);
            search(node.right,cur);
        }
    }
}
