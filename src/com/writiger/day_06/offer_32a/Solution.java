package com.writiger.day_06.offer_32a;

import java.util.*;

public class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            ans.add(temp.val);
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i ++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
