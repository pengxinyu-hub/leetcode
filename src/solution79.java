public class solution79 {
    private static int symbol=0;
    private static boolean[][] marked;
    public static boolean exist(char[][] board, String word) {
        marked=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    dfs(board,word,i,j,0);
                }
            }
        }
        return symbol==1;
    }

    private static void dfs(char[][] board,String word,int i,int j,int point){
        if(point==word.length()-1){
            marked[i][j]=true;
            if(board[i][j]==word.charAt(point))
                symbol=1;
            for(int m=0;m<board.length;m++){
                for (int n=0;n<board.length;n++){
                    marked[m][n]=false;
                }
            }
            return;
        }

        if(board[i][j]==word.charAt(point)&&point<word.length()-1){
            marked[i][j]=true;
            if(i<board.length-1&&!marked[i+1][j])
                dfs(board,word,i+1,j,point+1);
            if(i>0&&!marked[i-1][j])
                dfs(board,word,i-1,j,point+1);
            if(j<board[0].length-1&&!marked[i][j+1])
                dfs(board,word,i,j+1,point+1);
            if(j>0&&!marked[i][j-1])
                dfs(board,word,i,j-1,point+1);
        }
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        System.out.println(exist(board,"CBASA"));
    }
}
