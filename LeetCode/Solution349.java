import java.util.Arrays;
import java.util.HashSet;

/**
 * @author vert  @date 2019/9/16 18:08
 */
/*
349. 两个数组的交集(https://leetcode-cn.com/problems/intersection-of-two-arrays/)
给定两个数组，编写一个函数来计算它们的交集。

示例 1:
输入: nums1 = [1,2,2,1], nums2 = [2,2]
输出: [2]

示例 2:
输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出: [9,4]

说明:
输出结果中的每个元素一定是唯一的。
我们可以不考虑输出结果的顺序。
 */
public class Solution349 {
    public static void main(String[] args) {
        int[] num1 = {4,9,5},num2 = {9,4,9,8,4};
        Solution349 s = new Solution349();
        System.out.println(Arrays.toString(s.intersection(num1,num2)));
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<>();
        for (int n : nums2) set2.add(n);
        if (set1.size() < set2.size()) return set_intersection(set1,set2);
        else return set_intersection(set2,set1);
    }
    private int[] set_intersection(HashSet<Integer> set1,HashSet<Integer> set2){
        int[] res = new int[set1.size()];
        int idx = 0;
        for (int s : set1){
            if (set2.contains(s)) res[idx++] = s;
        }
        return Arrays.copyOf(res,idx);
    }
}
