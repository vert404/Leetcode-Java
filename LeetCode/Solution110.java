/**
 * @author vert  @date 2019/10/4 22:35
 */
/*
[110. 平衡二叉树](https://leetcode-cn.com/problems/balanced-binary-tree/)
给定一个二叉树，判断它是否是高度平衡的二叉树。
本题中，一棵高度平衡二叉树定义为：
一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。

示例 1:
给定二叉树 [3,9,20,null,null,15,7]
    3
   / \
  9  20
    /  \
   15   7
返回 true 。

示例 2:
给定二叉树 [1,2,2,3,3,null,null,4,4]
       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
返回 false 。
*/
public class Solution110 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public boolean isBalanced(TreeNode root) {
        return height(root) >=0;
    }

    private int height(TreeNode root){
        if (root == null){
            return 0;
        }
        int lh = height(root.left),rh = height(root.right);
        if (lh >= 0 && rh >=0 && Math.abs(lh-rh) <= 1){
            //返回此时结点的高度
            return Math.max(lh,rh) + 1;
        }else {
            //不满足条件表示子树不平衡返回-1，直到递归结束
            return -1;
        }
    }
}
