public class solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int column=matrix[0].length;
        int start=1;
        int end=row*column;
        while (start<=end){
            int medium=start+(end-start)/2;
            int mrow=medium%column==0?medium/column-1:medium/column;
            int mcolumn=medium%column==0?column-1:medium%column-1;
            if(target>matrix[mrow][mcolumn])
                start=medium+1;
            else if(target<matrix[mrow][mcolumn])
                end=medium-1;
            else return true;
        }
        return false;
    }
}
