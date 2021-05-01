public class solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] amounts=new int[amount+1];
        for(int j=1;j<=amount;j++) {
            amounts[j]=Integer.MAX_VALUE;
            for (int i = 0; i < coins.length; i++) {
                if(coins[i]<=j&&amounts[j]>amounts[j-coins[i]]){
                    amounts[j]=amounts[j-coins[i]]+1;
                }
            }
        }
        if(amounts[amount]==Integer.MAX_VALUE) return -1;
        return amounts[amount];
    }
    public static void main(String[] args) {
        int[] a={1, 2, 5};
        System.out.println(new solution322().coinChange(a,11));
    }
}
