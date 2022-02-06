package com.writiger.day_20.offer_07;

import java.util.HashMap;

public class Solution {
    int[] preorder;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder,int[] inorder){
        this.preorder = preorder;
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        return recur(0,0,inorder.length - 1);
    }
    TreeNode recur(int pre_root,int in_left, int in_right){
        if (in_left > in_right) return null;
        TreeNode root = new TreeNode(preorder[pre_root]);
        int idx = map.get(preorder[pre_root]);
        root.left = recur(pre_root + 1,in_left,idx - 1);
        root.right = recur(pre_root+(idx - in_left)+1,idx + 1,in_right);
        return root;
    }
}
