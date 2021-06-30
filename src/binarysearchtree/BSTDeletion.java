package binarysearchtree;

import java.util.Scanner;

public class BSTDeletion {

    public int getDeletionInput() {
        System.out.println("Please input the integer you want to delete.");
        System.out.println("Note: You can only delete one integer at a time.");
        Scanner keyboardInput = new Scanner(System.in);
        int intInput = keyboardInput.nextInt();
        return intInput;
    }

    public void delete(BSTTree bst) {
        int deletionInput = getDeletionInput();
        if (deletionInput == bst.root.value){
            performDeletion(bst.root, bst.root.value);
        }
        else if (deletionInput > bst.root.value){
                if (deletionInput == bst.root.rightChild.value) {
                    performDeletion(bst.root.rightChild, bst.root.rightChild.value);
                } else if (deletionInput >= bst.root.rightChild.value) {
                    performDeletion(bst.root.rightChild.rightChild, bst.root.rightChild.rightChild.value);
                } else if (deletionInput < bst.root.leftChild.value) {
                    performDeletion(bst.root.rightChild.leftChild, bst.root.rightChild.leftChild.value);
                } else {
                    System.out.println("The number is not found in the Binary Search Tree");
                }
        } else {
            if (deletionInput == bst.root.leftChild.value) {
                performDeletion(bst.root.leftChild, bst.root.leftChild.value);
            } else if (deletionInput > bst.root.leftChild.value) {
                performDeletion(bst.root.leftChild.rightChild, bst.root.leftChild.rightChild.value);
            } else if (deletionInput < bst.root.leftChild.value) {
                performDeletion(bst.root.leftChild.leftChild, bst.root.leftChild.leftChild.value);
            } else {
                System.out.println("The number is not found in the Binary Search Tree");
            }
        }

    }

    public BSTTree.BSTNode smallestNumber(BSTTree.BSTNode node) {
        if (node.leftChild == null) {
            return node;
        } else {
            return smallestNumber(node.leftChild);
        }
    }

    public BSTTree.BSTNode removeNode(BSTTree.BSTNode node){
        System.out.println("The selected node to delete is " + node.value);
        node = null;
        return null;
    }

    public void performDeletion(BSTTree.BSTNode node, int intInput) {
        //first case: no child node/deleting leaf node
        if (node.leftChild == null && node.rightChild == null) {
            System.out.println("This is a leaf node.");
            removeNode(node);
        }

        //second case: one child node
        else if ((node.leftChild != null && node.rightChild == null) ||
                (node.rightChild != null && node.leftChild == null)) {
            System.out.println("This node has one child.");
            if (intInput >= node.leftChild.value) {
                System.out.println("The node is replaced by its left child.");
                node.value = node.leftChild.value;
                removeNode(node.leftChild);
            } else {
                System.out.println("The node is replaced by its right child.");
                node.value = node.rightChild.value;
                removeNode(node.rightChild);
            }
        }

        //third case: two child nodes // (node.leftChild != null && node.rightChild != null)
        else {
            System.out.println("The node is replaced.");
            BSTTree.BSTNode smallestRight = smallestNumber(node.leftChild);
            node.value = smallestRight.value;
            removeNode(smallestRight);
        }
    }
}


    /*public boolean inputExist(BSTTree.BSTNode node, int deletionInput) {
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
        if (inputExist(new BSTTree.BSTNode(deletionInput), deletionInput)){
            performDeletion(new BSTTree.BSTNode(deletionInput), deletionInput);
            System.out.println("Thank you for entering a valid value. We will proceed with the deletion process.");
        }
        else {
            System.out.println("The number is not found in the Binary Search Tree.");
        }
    }*/
