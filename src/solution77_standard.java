/*
给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。

输入: n = 4, k = 2
输出:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 */

import java.util.ArrayList;
import java.util.List;

public class solution77_standard {
    /**
     *
     * @param n   1 ... n
     * @param k   k 个数的组合
     * @return    返回 1 ... n 中所有可能的 k 个数的组合。
     */
    public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> res=new ArrayList<>();
        int[] nums=new int[n];
        for(int i=0;i<n;i++) {
            nums[i]=i+1;
        }
        backtracking(k,0,nums,new ArrayList(),res);
        return res;
    }

    private void backtracking(int k,int start,int[] nums,List<Integer> cur,List<List<Integer>> res){
        if(cur.size()==k){
            res.add(new ArrayList<>(cur));
        }
        else if(cur.size()<k){
            for(int i=start;i<nums.length;i++){
                cur.add(nums[i]);
                backtracking(k,i+1,nums,cur,res);
                cur.remove(cur.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        solution77_standard solution77 = new solution77_standard();
        List<List<Integer>> a = solution77.combine(4, 2);
        System.out.println(a);
    }
}
