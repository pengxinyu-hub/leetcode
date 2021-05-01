public class solution1652 {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=1;j<=Math.abs(k);j++){
                if(k>0){
                    temp+=code[(i+j)%n];
                }
                if(k<0){
                    temp+=code[i-j<0?n+i-j:i-j];
                }
            }
            ans[i]=temp;
        }
        return ans;
    }
}
