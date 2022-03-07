package com.Amanjeet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


// Definition for a binary tree node.
class TreeNode {
    int val;
     TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
        this.left = left;
        this.right = right;
    }
 }

class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> hs = new HashMap<Integer, TreeNode>();
        Set<Integer> ch = new HashSet<>();
        Set<Integer> pa = new HashSet<>();
        TreeNode output;
        for(int[] list:descriptions){
            int p = list[0], c = list[1], l=list[2];
            ch.add(c);
            pa.add(p);
            if(! hs.containsValue(p)){
                TreeNode n = new TreeNode(p);
                hs.put(p,n);
            }
            if(! hs.containsValue(c)){
                TreeNode n = new TreeNode(c);
                hs.put(c, n);
            }
            if(l == 1){
                hs.get(p).left = hs.get(c);
            }else {
                hs.get(p).right = hs.get(c);
            }
            output = hs.get(p);
        }

//        System.out.println(ch);
//        System.out.println(pa);
        pa.removeAll(ch);
        int o=0;
        System.out.println(pa);
        for(int val : pa){
            o= val;
            break;
        }

        return hs.get(o);
    }
}

public class q3 {
}
