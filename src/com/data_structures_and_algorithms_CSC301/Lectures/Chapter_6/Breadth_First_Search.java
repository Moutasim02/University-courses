package com.data_structures_and_algorithms_CSC301.Lectures.Chapter_6;

import java.util.LinkedList;
import java.util.Queue;

// Opposing to DFT, This one go to each two child (if exist)
// then go to the next upper child.

//      a
//    /   \
//   b     c
//  / \     \
// d   e     f

public class Breadth_First_Search {
    public static void main(String[] args) {
        TreeNode<Character> a = new TreeNode<>('a');
        TreeNode<Character> b = new TreeNode<>('b');
        TreeNode<Character> c = new TreeNode<>('c');
        TreeNode<Character> d = new TreeNode<>('d');
        TreeNode<Character> e = new TreeNode<>('e');
        TreeNode<Character> f = new TreeNode<>('f');

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.right = f;

        BFS(a);
    }

    private static void BFS(TreeNode<Character> root) {
        if (root == null) System.out.println("Root is null");

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (queue.size() > 0) {
            var current = queue.poll();
            System.out.println(current);

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
}
