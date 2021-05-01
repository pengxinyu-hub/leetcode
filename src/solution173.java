import java.util.LinkedList;
import java.util.Queue;

public class solution173 {
    class BSTIterator {
        Queue<Integer> queue;
        public BSTIterator(TreeNode root) {
            queue=new LinkedList<>();
            search(root);
        }

        private void search(TreeNode root){
            if(root==null)
                return;
            search(root.left);
            queue.add(root.val);
            search(root.right);
        }

        public int next() {
            return queue.remove();
        }

        public boolean hasNext() {
            return queue.isEmpty();
        }
    }
}
