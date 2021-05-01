import java.util.Arrays;

public class solution179 {
    public String largestNumber(int[] nums) {
        String[] numStr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            numStr[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(numStr,(a,b)->(b+a).compareTo(a+b));
        String ans="";
        for(String str:numStr)
            ans+=str;
        if(ans.charAt(0)=='0')
            ans="0";
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new solution179().largestNumber(new int[]{3,30,34,5,9}));
    }
}
