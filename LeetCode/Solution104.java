/**
 * @author vert  @date 2019/9/20 14:07
 */
/*
104. 二叉树的最大深度(https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)
给定一个二叉树，找出其最大深度。
二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
说明: 叶子节点是指没有子节点的节点。

示例：
给定二叉树 [3,9,20,null,null,15,7]，
    3
   / \
  9  20
    /  \
   15   7
返回它的最大深度 3 。
 */
public class Solution104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null){  //遇到空结点，返回0
            return 0;
        }else{
            int left_height = maxDepth(root.left);  //进入左子结点
            int right_height = maxDepth(root.right);    //进入右子结点
            //一直递归到叶子结点，比较左右谁的深度大
            return java.lang.Math.max(left_height,right_height) + 1;    //从叶子结点向根结点累加
        }
    }
}
