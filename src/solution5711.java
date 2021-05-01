public class solution5711 {
    public int maxValue(int n, int index, int maxSum) {
        if (maxSum < n) return 0;
        if (maxSum == n) return 1;
        int diff = maxSum - n, left = index, right = index, res = 1, dl = 0, dr = 0;
        while (diff > 0) {
            if (--left >= 0) dl++;
            if (++right < n) dr++;
            if (left < 0 && right >= n) {
                res += diff % n == 0 ? diff / n : diff / n + 1;
                return res;
            }
            res += 1;
            diff -= (dl + dr + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new solution5711_un().maxValue(1,0,850015631));
    }
}
