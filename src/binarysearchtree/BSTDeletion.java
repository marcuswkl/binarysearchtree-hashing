package binarysearchtree;

import java.util.Scanner;

public class BSTDeletion {

    public void printDeleteMenu() {
        System.out.println("Please input the integer you want to delete.");
        System.out.println("Note: You can only delete one integer at a time.");
    }

    public boolean inputExist(BSTTree.BSTNode node, int deletionInput) {
        if(node == null) {
            return false;
        }
        if(node.value == deletionInput){
            return true;
        }

        boolean checkLeft = inputExist(node.leftChild, deletionInput);
        if(checkLeft) return true;

        boolean checkRight = inputExist(node.rightChild, deletionInput);

        return checkRight;
    }

    public void delete(BSTTree bst) {
        printDeleteMenu();
        int deletionInput = getDeletionInput();
        if (inputExist(new BSTTree.BSTNode(deletionInput), deletionInput)){
            performDeletion(new BSTTree.BSTNode(deletionInput), deletionInput);
            System.out.println("Thank you for entering a valid value. We will proceed with the deletion process.");
        }
        else {
            System.out.println("The number is not found in the Binary Search Tree.");
        }
    }

    public int getDeletionInput() {
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput.nextInt();
    }

    public BSTTree.BSTNode smallestNumber(BSTTree.BSTNode root){
        if(root.leftChild == null) {
            return root;
        }
        else {
            return smallestNumber(root.leftChild);
        }
    }

    public BSTTree.BSTNode getNode(int data) {
        BSTTree.BSTNode currentNode = new BSTTree.BSTNode(data);
        return currentNode;
    }

    public void performDeletion(BSTTree.BSTNode node, int data) {
        //first case: no child node/deleting leaf node
        if (node.leftChild == null && node.rightChild == null) {
            System.out.println("This is a leaf node.");
            node = null;
        }

        //second case: one child node
        else if ((node.leftChild != null && node.rightChild == null) ||
                (node.rightChild != null && node.leftChild == null)) {
            if (data >= node.leftChild.value) {
                System.out.println("The node is replaced by its left child.");
                node.value = node.leftChild.value;
            } else {
                System.out.println("The node is replaced by its right child.");
                node.value = node.rightChild.value;
            }
        }

        //third case: two child nodes // (node.leftChild != null && node.rightChild != null)
        else {
            System.out.println("The node is replaced.");
            System.out.println(node.leftChild);
            System.out.println(node.leftChild.value);
            System.out.println(node.rightChild);
            System.out.println(node.rightChild.value);
            BSTTree.BSTNode smallestRight = smallestNumber(node.leftChild);
            node.value = smallestRight.value;
            smallestRight = null;
        }
    }
}