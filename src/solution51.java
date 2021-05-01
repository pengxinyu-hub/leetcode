import java.util.ArrayList;
import java.util.List;

public class solution51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] c=new char[n][n];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                c[i][j]='.';
            }
        }
        dfs(c,0,res);
        return res;
    }

    private void dfs(char[][] c,int row,List<List<String>> res){
        if(row==c.length) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < c.length; i++) {
                String s = String.valueOf(c[i]);
                list.add(s);
            }
            res.add(new ArrayList<>(list));
        }
        for(int i=0;i<c.length;i++){
            if(!check(c,row,i))  continue;
            c[row][i]='Q';
            dfs(c,row+1,res);
            c[row][i]='.';
        }
    }

    private boolean check(char[][] c,int row,int column){
        for(int i=0;i<row;i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i][j] == 'Q' && (j == column || Math.abs(i - row) == Math.abs(j - column)))
                    return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        List<List<String>> res=new solution51().solveNQueens(4);
        System.out.println(res);
    }

}
