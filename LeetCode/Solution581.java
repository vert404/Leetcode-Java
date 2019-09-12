import java.util.Arrays;

/**
 * @author vert  @date 2019/9/12 18:12
 */
/*
581. 最短无序连续子数组(https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/)
给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
你找到的子数组应是最短的，请输出它的长度。

示例 1:
输入: [2, 6, 4, 8, 10, 9, 15]
输出: 5
解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。

说明 :
输入的数组长度范围在 [1, 10,000]。
输入的数组可能包含重复元素 ，所以升序的意思是<=。
 */
public class Solution581 {
    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        Solution581 s = new Solution581();
        System.out.println(s.findUnsortedSubarray(nums));
    }
    public int findUnsortedSubarray(int[] nums) {
        int[] a = nums.clone();
        Arrays.sort(a);
        if(Arrays.equals(nums,a))
            return 0;
        int m = 0,n = a.length-1;
        while (nums[m] == a[m]){
            m++;
        }
        while (nums[n] == a[n]){
            n--;
        }
        return n - m + 1;
    }
}
