import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class solution100 {
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null||q==null)
            return p==q;
        return p.val==q.val && isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }

    public static void main(String[] args) {
        TreeNode p=new TreeNode(2,new TreeNode(1),new TreeNode(3));
        TreeNode q=new TreeNode(2,new TreeNode(1),new TreeNode(3,new TreeNode(1),null));
        System.out.println(new solution100().isSameTree(p,q));
    }
}
