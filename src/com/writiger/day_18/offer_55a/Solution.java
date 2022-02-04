package com.writiger.day_18.offer_55a;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 *递归实现
 **/
//public class Solution {
//    public int maxDepth(TreeNode root) {
//        if(root == null) return 0;
//        else {
//            int left = maxDepth(root.left) + 1;
//            int right = maxDepth(root.right) + 1;
//            return Math.max(left, right);
//        }
//    }
//}

/*
* 层序遍历
* */

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        List<TreeNode> queue = new LinkedList<TreeNode>(){{add(root);}}, temp;
        int res = 0;
        while(!queue.isEmpty()) {
            temp = new LinkedList<>();
            for(TreeNode node : queue) {
                if(node.left != null) temp.add(node.left);
                if(node.right != null) temp.add(node.right);
            }
            queue = temp;
            res++;
        }
        return res;
    }
}
