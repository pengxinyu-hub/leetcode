public class solution204 {
    //厄拉多塞筛选法
    public int countPrimes(int n){
        int[] a=new int[n];
        for(int i=2;i<n;i++){
            a[i]=1;
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(a[i]==1){
                count++;
                for(int j=i;j<n;j+=i){
                    a[j]=0;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new solution204().countPrimes(4));
    }
}
