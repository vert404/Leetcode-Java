/**
 * @author vert  @date 2019/9/29 22:40
 */
/*
665. 非递减数列(https://leetcode-cn.com/problems/non-decreasing-array/)
给定一个长度为 n 的整数数组，你的任务是判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。

示例 1:
输入: [4,2,3]
输出: True
解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。

示例 2:
输入: [4,2,1]
输出: False
解释: 你不能在只改变一个元素的情况下将其变为非递减数列。

说明:  n 的范围为 [1, 10,000]。
 */
public class Solution665 {
    //出现 a[i] > a[i+1]   判断a[i] 左边a[i-1] 和 右边a[i+1] 的大小
    //如果左边小，则把a[i] 变小；如果右边小，则把a[i+1] 变大；保持当前三个数有序
    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length <= 1){
            return true;
        }
        int count = 0;
        for (int i=1;i<nums.length-1;i++){
            if (nums[i] > nums[i+1]){
                count++;
                if (count > 1) return false;
                if (nums[i-1] < nums[i+1]){
                    nums[i] = nums[i-1];
                }else{
                    nums[i+1] = nums[i];
                }
            }
        }
        return true;
    }
}

