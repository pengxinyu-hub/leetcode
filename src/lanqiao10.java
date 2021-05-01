public class lanqiao10 {
    public boolean canfinish(int[] num){
        int index=0;
        for(int i=1;i<num.length;i++){
            if(num[i]==1)
                index=i;
        }

        return dfs(num,1,index,1,num.length-1);
    }

    private boolean dfs(int[] num,int N,int index,int start,int end){
        if(index<1||index>num.length-1||num[index]!=N) {
            return false;
        }
        if(N==num.length-1&&num[index]==N){
            return true;
        }
        return num[index]==N&&(
                dfs(num,N+1,index+1,start,end)||
                dfs(num,N+1,index-1,start,end)||
                dfs(num,N+1,start,start+1,end)||
                dfs(num,N+1,end,start,end-1)
                );
    }

    public static void main(String[] args) {
        System.out.println(new lanqiao10().canfinish(new int[]{2,4,1,3,5}));
    }
}
