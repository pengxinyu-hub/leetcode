import java.util.Stack;

public class solution456 {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        if(n<3)  return false;
        Stack<Integer> MaxNum=new Stack<>();
        int SecondNum=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<SecondNum)
                return true;
            while (!MaxNum.isEmpty()&&nums[i]>MaxNum.peek())
                SecondNum=MaxNum.pop();
            MaxNum.push(nums[i]);
        }
        return false;
    }
}
