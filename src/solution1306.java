public class solution1306 {
    public boolean canReach(int[] arr, int start) {
        return dfs(arr,start);
    }

    private boolean dfs(int[] arr,int pos){
        if(pos<0 || pos>=arr.length || arr[pos]==-1){
            return false;
        }
        int temp=arr[pos];
        arr[pos]=-1;
        return temp==0||dfs(arr,pos+temp)||dfs(arr,pos-temp);
    }
}
