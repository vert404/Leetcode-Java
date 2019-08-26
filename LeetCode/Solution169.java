import java.util.HashSet;

/**
 * @author vert  @date 2019/8/26 23:41
 */
/*
169. 求众数(https://leetcode-cn.com/problems/majority-element/)
给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
你可以假设数组是非空的，并且给定的数组总是存在众数。

示例 1:
输入: [3,2,3]
输出: 3

示例 2:
输入: [2,2,1,1,1,2,2]
输出: 2
 */
public class Solution169 {
    public static void main(String[] args) {
        int[] nums = {5,6,6,6,5};//{3,2,3};//{2,2,1,1,1,2,2};
        Solution169 s = new Solution169();
        System.out.println(s.majorityElement(nums));
    }
    //从第一个数开始count=1，遇到相同的就加1，遇到不同的就减1，减到0就重新换个数开始计数，总能找到最多的那个
    public int majorityElement(int[] nums) {
        int ret = nums[0];
        int count = 1;
        for(int num : nums) {
            if(num != ret) {
                count--;
                if(count == 0) {
                    count = 1;
                    ret = num;
                }
            }
            else
                count++;
        }
        return ret;
    }
    //蠢方法
//    public int majorityElement(int[] nums) {
//        HashSet set = new HashSet();
//        int m = 0,n = 0,maj = 0;
//        for (int i : nums){
//            set.add(i);
//        }
//        for (Object i : set){
//            m = (int)i;
//            int a = 0;
//            for (int j=0;j<nums.length;j++){
//                if (m == nums[j]){
//                    a++;
//                }
//                if (n < a){ //记录出现次数最多的有多少次和对应的值
//                    n = a;
//                    maj = m;
//                }
//            }
//        }
//        return maj;
//    }
}
