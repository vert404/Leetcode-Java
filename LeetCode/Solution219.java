import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author vert  @date 2019/9/11 14:35
 */
/*
219. 存在重复元素 II(https://leetcode-cn.com/problems/contains-duplicate-ii/)
给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。

示例 1:
输入: nums = [1,2,3,1], k = 3
输出: true

示例 2:
输入: nums = [1,0,1,1], k = 1
输出: true

示例 3:
输入: nums = [1,2,3,1,2,3], k = 2
输出: false
 */
public class Solution219 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        Solution219 s = new Solution219();
        System.out.println(s.containsNearbyDuplicate(nums,k));
    }
    //HashSet方法，时间复杂度：O(n)。
    /*public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            //维持一个大小为 k 的滑动窗口
            if (set.size() > k)
                set.remove(nums[i-k]);
        }
        return false;
    }*/
    //HashMap方法
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
                return true;
            map.put(nums[i],i);
        }
        return false;
    }
}
