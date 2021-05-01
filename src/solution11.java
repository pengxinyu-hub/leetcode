public class solution11 {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int ans=0;
        while (start<end){
            int min=Math.min(height[start],height[end]);
            int t=(end-start)*min;
            if(t>ans){
                ans=t;
            }
            if(height[start]<=height[end]){
                start++;
            }
            else {
                end--;
            }
        }
        return ans;
    }
}
