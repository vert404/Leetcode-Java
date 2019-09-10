import java.util.HashMap;

/**
 * @author vert  @date 2019/9/10 19:46
 */
/*
121. 买卖股票的最佳时机(https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/)
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
注意你不能在买入股票前卖出股票。

示例 1:
输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。

示例 2:
输入: [7,6,4,3,1]
输出: 0
解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class Solution121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution121 s = new Solution121();
        System.out.println(s.maxProfit(prices));
    }
    //一次遍历。峰和谷，我们需要找到最小的谷之后的最大的峰。
    public int maxProfit(int prices[]) {
        if (prices.length == 0) return 0;
        int min = prices[0];
        int max = 0;
        for (int i=0;i<prices.length;i++){
            if (min > prices[i])
                min = prices[i];
            else if (max < prices[i] - min)
                max = prices[i] - min;
        }
        return max;
    }
    //暴力法
    /*public int maxProfit(int[] prices) {
        int i = 0,j = 0,temp = 0,max = 0;
        while (j < prices.length) {
            for (i = j; i < prices.length; i++) {
                temp = prices[i] - prices[j];
                if (max <= temp) {
                    max = temp;
                }
            }
            j++;
        }
        return max;
    }*/
}
