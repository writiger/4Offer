package com.writiger.day_06.offer_32c;

import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null)
            queue.add(root);
        while(!queue.isEmpty()){
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i = queue.size(); i > 0; i --){
                TreeNode node = queue.poll();
                if(res.size() % 2 == 0) {
                    assert node != null;
                    temp.addLast(node.val);
                }
                else {
                    assert node != null;
                    temp.addFirst(node.val);
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(temp);
        }
        return res;
    }
}
