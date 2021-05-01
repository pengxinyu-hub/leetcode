public class solution79_standard {
    private boolean[][] marked;

    public boolean exist(char[][] board,String word){
        int row=board.length;
        int column=board[0].length;
        marked=new boolean[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(word.charAt(0)==board[i][j]&&search(board,word,i,j,0))
                    return true;
            }
        }
        return false;
    }

    private boolean search(char[][] board,String word,int i,int j,int point){
        if(point==word.length()){
            return true;
        }
        if(i<0||i>=board.length||j<0||j>=board[0].length||word.charAt(point)!=board[i][j]||marked[i][j])
            return false;

        marked[i][j]=true;
        if(search(board,word,i+1,j,point+1)||
        search(board,word,i-1,j,point+1)||
        search(board,word,i,j-1,point+1)||
        search(board,word,i,j+1,point+1))
            return true;

        marked[i][j]=false;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'a'}};
        System.out.println(new solution79_standard().exist(board,"ab"));
    }
}
