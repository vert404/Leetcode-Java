import java.util.Arrays;

/**
 * @author vert  @date 2019/9/5 13:38
 */
/*
88. 合并两个有序数组(https://leetcode-cn.com/problems/merge-sorted-array/)
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:
初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

示例:
输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
输出: [1,2,2,3,5,6]
 */
public class Solution088 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3,n = 3;
        Solution088 s = new Solution088();
        s.merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n -1;
        m--;
        n--;
        while (m >= 0 && n >=0){    //从下标高的开始赋值,两数组中较大的赋给nums1[p--]
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        //当此时n < 0时，不管m大于等于或者小于0，nums1中可能有未参与比较的，不用管，整个数组已排好序，即为结果
        //当此时n >= 0时，nums2中有未参与比较的,将这些元素放入nums1中
        while (n >= 0){
            nums1[p--] = nums2[n--];
        }
    }
}
