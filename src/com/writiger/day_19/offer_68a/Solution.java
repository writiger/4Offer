package com.writiger.day_19.offer_68a;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = root;
        while(ans != null) {
            if(p.val < ans.val && q.val < ans.val)
                ans = ans.left;
            else if(p.val > ans.val && q.val > ans.val)
                ans = ans.right;
            else
                break;
        }
        return ans;
    }
}
