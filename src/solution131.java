import java.util.ArrayList;
import java.util.List;

public class solution131 {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        backtracking(0,s,new ArrayList<>(),result);
        return result;
    }

    private void backtracking(int start,String s,List<String> cur,List<List<String>> res){
        if(start==s.length()){
            res.add(new ArrayList<>(cur));
        }
        for(int i=start;i<s.length();i++){
            String s1=s.substring(start,i+1);
            if(!isPalindrome(s1))
                continue;
            cur.add(s1);
            backtracking(i+1,s,cur,res);
            cur.remove(cur.size()-1);
        }
    }

    private  boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new solution131().partition("aab"));
    }
}
