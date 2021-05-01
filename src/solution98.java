public class solution98 {
    long pre = -9223372036854775808L;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        boolean lr=isValidBST(root.left);
        boolean ans=root.val>pre;
        pre=root.val;
        boolean ri=isValidBST(root.right);
        return lr&&ans&&ri;
    }
}
