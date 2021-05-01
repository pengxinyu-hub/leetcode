import java.util.ArrayList;
import java.util.List;

public class solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        dfs(n,"",ans,0,0);
        return ans;
    }

    private void dfs(int n,String cur,List<String> ans,int left,int right){
        if(left>n||right>n) return;
        if(left==n&&right==n){
            ans.add(cur);
            return;
        }

        if(right<=left){
            dfs(n,cur+"(",ans,left+1,right);
            dfs(n,cur+")",ans,left,right+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new solution22().generateParenthesis(3));
    }
}
