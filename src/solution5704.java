public class solution5704 {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length, ans = 0;
        for (int i = nums[k], l = k, r = k; i >= 1; --i) {
            while (l > 0 && nums[l - 1] >= i) --l;
            while (r + 1 < n && nums[r + 1] >= i) ++r;
            ans = Math.max(ans, (r - l + 1) * i);
        }
        return ans;
    }
}
