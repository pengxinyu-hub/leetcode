import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return res;
        queue.add(root);
        while (!queue.isEmpty()){
            int count=queue.size();
            List<Integer> cur=new ArrayList<>();
            while (count>0) {
                TreeNode node = queue.remove();
                cur.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                count--;
            }
            res.add(cur);
        }
        return res;
    }
}
