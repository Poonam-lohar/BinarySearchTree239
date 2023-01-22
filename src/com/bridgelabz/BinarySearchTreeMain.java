package com.bridgelabz;

public class BinarySearchTreeMain {

    public static void main(String[] args) {

        System.out.println("Welcome To Binary Search Tree Program........");

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node root = null;
        root = binarySearchTree.insert(root,56);
        root = binarySearchTree.insert(root,30);
        root = binarySearchTree.insert(root,70);
        binarySearchTree.print(root);
    }
}
