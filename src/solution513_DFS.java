public class solution513_DFS {
    private int max=-1;
    private int ans;
    public int findBottomLeftValue(TreeNode root){
        dfs(root,0);
        return ans;
    }

    private void dfs(TreeNode node,int depth){
        if(node!=null){
            if(depth>max){
                max=depth;
                ans=node.val;
            }
            dfs(node.left,depth+1);
            dfs(node.right,depth+1);
        }
    }
}
