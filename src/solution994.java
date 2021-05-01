import java.util.LinkedList;
import java.util.Queue;

public class solution994 {
    private boolean marked[][];
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int column= grid[0].length;
        int minute=0;
        marked=new boolean[row][column];
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j]==2) {
                    queue.add(new int[]{i, j});
                    marked[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()){
            if(!HasFreshOrange(grid)) break;
            int t=queue.size();
            while (t>0){
                int[] a=queue.remove();
                marked[a[0]][a[1]]=true;
                if(a[0]>0&&grid[a[0]-1][a[1]]==1&&!marked[a[0]-1][a[1]]) {
                    grid[a[0]-1][a[1]]=2;
                    queue.add(new int[]{a[0] - 1, a[1]});
                }
                if(a[0]<row-1&&grid[a[0]+1][a[1]]==1&&!marked[a[0]+1][a[1]]) {
                    grid[a[0] +1][a[1]] = 2;
                    queue.add(new int[]{a[0] + 1, a[1]});
                }
                if(a[1]>0&&grid[a[0]][a[1]-1]==1&&!marked[a[0]][a[1]-1]) {
                    grid[a[0]][a[1]-1] = 2;
                    queue.add(new int[]{a[0], a[1] - 1});
                }
                if(a[1]<column-1&&grid[a[0]][a[1]+1]==1&&!marked[a[0]][a[1]+1]) {
                    grid[a[0]][a[1]+1] = 2;
                    queue.add(new int[]{a[0], a[1] + 1});
                }
                t--;
            }
            minute++;
        }
        if(HasFreshOrange(grid))  return -1;
        return minute;
    }

    private boolean HasFreshOrange(int[][] grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid={{0,2}};
        System.out.println(new solution994().orangesRotting(grid));
    }
}
