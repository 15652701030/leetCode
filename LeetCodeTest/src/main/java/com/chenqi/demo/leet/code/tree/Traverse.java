package com.chenqi.demo.leet.code.tree;

import java.util.Stack;

public class Traverse {

    /**
     * 非递归实现前序遍历
     * @param head
     */
    public static void preOrder(TreeNode head) {
        if (head != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(head);
            while (!stack.isEmpty()){
                TreeNode pop = stack.pop();
                System.out.print(pop.value + " ");
                if (pop.right != null) {
                    stack.push(pop.right);
                }
                if (pop.left != null) {
                    stack.push(pop.left);
                }
            }
        }
    }




    public static void main(String[] args) {
        TreeNode A = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        TreeNode C = new TreeNode("C");
        TreeNode D = new TreeNode("D");
        TreeNode E = new TreeNode("E");
        TreeNode F = new TreeNode("F");
        TreeNode G = new TreeNode("G");
        TreeNode H = new TreeNode("H");
        TreeNode I = new TreeNode("I");
        TreeNode J = new TreeNode("J");
        TreeNode K = new TreeNode("K");

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        D.left = H;
        D.right = I;
        E.right = J;
        C.left = F;
        C.right = G;
        F.right = K;

        preOrder(A);
    }
}
