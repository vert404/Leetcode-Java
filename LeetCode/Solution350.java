import java.util.Arrays;

/**
 * @author vert  @date 2019/9/16 17:53
 */
/*
350. 两个数组的交集 II(https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/)
给定两个数组，编写一个函数来计算它们的交集。

示例 1:
输入: nums1 = [1,2,2,1], nums2 = [2,2]
输出: [2,2]

示例 2:
输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出: [4,9]

说明：
输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
我们可以不考虑输出结果的顺序。

进阶:
如果给定的数组已经排好序呢？你将如何优化你的算法？
如果 nums1 的大小比 nums2 小很多，哪种方法更优？
如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class Solution350 {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1},num2 = {2,2};
        Solution350 s = new Solution350();
        System.out.println(Arrays.toString(s.intersect(num1,num2)));
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] res = new int[nums1.length > nums2.length ? nums2.length : nums1.length];
        int idx = 0;
        for (int i=0,j=0;i<nums1.length && j<nums2.length; ){
            if (nums1[i] < nums2[j])        //谁小谁往后移一位
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else{
                res[idx++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOf(res,idx);
    }
}
