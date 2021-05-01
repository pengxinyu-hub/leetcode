import java.util.ArrayList;
import java.util.List;

public class solution17 {
    private String[] phone={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.equals(""))  return res;
        res.add("");
        for(int i=0;i<digits.length();i++){
            res=combine(res,phone[digits.charAt(i)-'2']);
        }
        return res;
    }

    private List<String> combine(List<String> res,String s){
        List<String> r=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(String s1:res){
                s1+=s.charAt(i);
                r.add(s1);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(new solution17().letterCombinations("45"));
    }
}
