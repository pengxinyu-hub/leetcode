import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class solution3 {
    public int lengthOfLongestSubstring(String s) {
        int length=s.length();
        if(length==0||length==1) return length;
        int start=0;
        int end=1;
        int dict[]=new int[256];
        dict[s.charAt(start)]++;
        int ans=1;
        while (end<length){
            char c1=s.charAt(start);
            char c2=s.charAt(end);
            if(dict[c2]!=0){
                dict[c1]--;
                start++;
            }
            else {
                dict[c2]++;
                if(end-start+1>ans)
                    ans=end-start+1;
                end++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new solution3().lengthOfLongestSubstring("pwwkew"));
    }
}
