import java.util.ArrayList;
import java.util.List;

public class solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        dfs(root,"",list);
        return list;
    }

    private void dfs(TreeNode node,String cur,List<String> list) {
        if(node==null){
            return;
        }
        cur+=node.val;
        if(node.left==null&&node.right==null){
            list.add(cur);
        }
        else {
            dfs(node.left,cur+"->",list);
            dfs(node.right,cur+"->",list);
        }
    }
}
