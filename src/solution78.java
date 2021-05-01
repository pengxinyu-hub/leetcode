/*
给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。

解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
示例 1：
输入：nums = [1,2,3]
输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
示例 2：
输入：nums = [0]
输出：[[],[0]]
 */

import java.util.ArrayList;

import java.util.List;

public class solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtracking(0,res,new ArrayList<>(),nums);
        return res;
    }

    private void backtracking(int start,List<List<Integer>> res,List<Integer> cur,int[] nums){
        res.add(new ArrayList<>(cur));
        for(int i=start;i<nums.length;i++) {
            cur.add(nums[i]);
            backtracking(i+1,res, cur, nums);
            cur.remove(cur.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(new solution78().subsets(a));
    }
}
