public class solution547 {
    private boolean marked[];
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        marked=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!marked[i]) {
                dfs(isConnected, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] connected,int v){
        marked[v]=true;
        for(int i=0;i<connected[v].length;i++){
            if(!marked[i]&&connected[v][i]==1){
                dfs(connected,i);
            }
        }
    }

    public static void main(String[] args) {
        int[][] a={{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(new solution547().findCircleNum(a));
    }
}
