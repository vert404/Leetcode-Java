import java.util.HashMap;

/**
 * @author vert  @date 2019/8/22 22:40
 */
/*
509. 斐波那契数(https://leetcode-cn.com/problems/fibonacci-number/)

斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，
后面的每一项数字都是前面两项数字的和。也就是：
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
给定 N，计算 F(N)。

示例 1：
输入：2
输出：1
解释：F(2) = F(1) + F(0) = 1 + 0 = 1.

示例 2：
输入：3
输出：2
解释：F(3) = F(2) + F(1) = 1 + 1 = 2.

示例 3：
输入：4
输出：3
解释：F(4) = F(3) + F(2) = 2 + 1 = 3.

提示：
0 ≤ N ≤ 30
 */
public class Solution509 {
    public static void main(String[] args) {
        int N = 65;
        Solution509 s = new Solution509();
        System.out.println(s.fib(N));
    }

        public int fib(int N) {
        HashMap<Integer,Integer> map = new HashMap<>();//使用HashMap降低时间复杂度
        int a = 1;//F(2),F(1)=1
        if (N == 0)
            return 0;
        if (N == 1 || N == 2)
            return 1;
        for (int i=3;i<=N;i++){
            map.put(1,1);
            map.put(2,1);
            map.put(i,(map.get(i-1)+map.get(i-2)));
        }
        return map.get(N);
    }
//    public int fib(int N) {//当N变大时，效率越来越低
//        if (N == 0 || N == 1) {
//            return N;
//        }
//        return fib(N - 1) + fib(N - 2);
//    }
}
