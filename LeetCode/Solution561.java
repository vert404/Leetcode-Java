import java.util.Arrays;

/**
 * @author vert  @date 2019/8/22 21:34
 */
/*
561. 数组拆分 I(https://leetcode-cn.com/problems/array-partition-i/)
给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。

示例 1:
输入: [1,4,3,2]
输出: 4
解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).

提示:
n 是正整数,范围在 [1, 10000].
数组中的元素范围在 [-10000, 10000].
 */
public class Solution561 {
    public static void main(String[] args) {
        int[] a = {9,1,4,3,2,-5};
        Solution561 s = new Solution561();
        System.out.println(s.arrayPairSum(a));
    }
    public int arrayPairSum(int[] nums) {
        int sums = 0;
        Arrays.sort(nums);//排序
        for(int i=0;i<nums.length;i++){
            if ((i&1) == 0){
                sums += nums[i];//取数组下标偶数位相加总和就是最小值
            }
        }
        return sums;
    }
}
