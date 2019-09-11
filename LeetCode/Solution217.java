import java.util.Arrays;
import java.util.HashSet;

/**
 * @author vert  @date 2019/9/11 14:10
 */
/*
217. 存在重复元素(https://leetcode-cn.com/problems/contains-duplicate/)
给定一个整数数组，判断是否存在重复元素。
如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

示例 1:
输入: [1,2,3,1]
输出: true

示例 2:
输入: [1,2,3,4]
输出: false

示例 3:
输入: [1,1,1,3,3,4,3,2,4,2]
输出: true
 */
public class Solution217 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        Solution217 s = new Solution217();
        System.out.println(s.containsDuplicate(nums));
    }
    //使用堆排序方法，Arrays.sort()，最坏情况下具有O(nlogn) 的时间复杂度。
    public boolean containsDuplicate(int[] nums) {
        int[] a = nums;
        Arrays.sort(a);
        for (int i=0;i<a.length - 1;i++){
            if (a[i] == a[i+1]) return true;
        }
        return false;
    }
    //使用HashSet，时间复杂度为 O(n)。方法较上一个慢
    /*public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return nums.length != set.size();
    }*/
}
