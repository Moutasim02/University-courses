package com.data_structures_and_algorithms_CSC301.Labs.Lab11;

public class testBST {

    public static void main(String[] args) {
        BST_int tree1;
        Integer[] nums1 = {20, 10, 16, 40, 30, 27, 23, 50};
        tree1 = new BST_int(nums1);
        System.out.println("Inorder Traversal");
        tree1.inorder();
        System.out.println("\nPost Order Traversal");
        tree1.postorder();
		System.out.println("\nTree1: ");
		tree1.print();


        BST_int tree2;
        // My ID 1080415: so I will add 8, 4, 15
        Integer[] nums2 = {40, 30, 27, 8, 4, 15};
        //Creating the special tree2 as shown in the figure provided in the lab
        tree2 = new BST_int(nums2);
        System.out.println("\nTree2 : ");
        tree2.print();
        System.out.println("\nItem 4 is available? " + tree2.search(4));
        System.out.println("8 Deleted? " + tree2.delete(8));
        tree2.createNewNode(13);
        System.out.println("Node 13 created");
        tree2.createNewNode(12);
        System.out.println("Node 12 created");
        System.out.println("Inorder Traversal");
        tree2.inorder();
        System.out.println("Post Order Traversal");
        tree2.postorder();

    }

}
