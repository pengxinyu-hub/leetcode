public class solution45 {
    private int min=Integer.MAX_VALUE;
    public int jump(int[] nums) {
        return dfs(nums,0,0);
    }

    private int dfs(int[] nums,int step,int count){
        if(step>=nums.length-1)  return count;
        for(int i = nums[step]; i >= 1; i--){
            int temp=dfs(nums,step+i,count+1);
            if(temp<=min){
                min=temp;
            }else {
                return min;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a={2,3,1,1,4};
        System.out.println(new solution45().jump(a));
    }
}
