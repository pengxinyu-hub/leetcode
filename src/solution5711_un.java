public class solution5711_un {
    public int maxValue(int n, int index, int maxSum) {
        int diff=maxSum-n;
        if(diff==0) return 1;

        int left=index;
        int right=index;
        int ans=1;
        while (diff>=right-left+1){
            diff-=(right-left+1);
            if(left>=1)
                left--;
            if(right<n-1)
                right++;
            ans++;
            if(left<=0&&right>=n-1){
                ans+=diff/n;
                return ans;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new solution5711_un().maxValue(4,0,6));
    }
}
