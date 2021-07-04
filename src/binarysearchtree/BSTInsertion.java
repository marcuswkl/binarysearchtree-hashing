package binarysearchtree;

import java.util.Scanner;

public class BSTInsertion {

    public void printInsertMenu() {
        System.out.println("Please input a positive integer.");
        System.out.println("For example: 7");
    }

    public int getInsertionInput() {
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput.nextInt();
    }

    public void insert(BSTTree bst) {
        printInsertMenu();
        int insertionInput = getInsertionInput();

        if (bst.root == null) {
            bst.root = new BSTTree.BSTNode(insertionInput);
        } else {
            BSTTree.BSTNode currentNode = bst.root;
            BSTTree.BSTNode parentNode;

            while (true) {
                parentNode = currentNode;

                if (insertionInput < currentNode.value) {
                    currentNode = currentNode.leftChild;

                    if (currentNode == null) {
                        parentNode.leftChild = new BSTTree.BSTNode(insertionInput);
                        return;
                    }
                } else {
                    currentNode = currentNode.rightChild;

                    if (currentNode == null) {
                        parentNode.rightChild = new BSTTree.BSTNode(insertionInput);
                        return;
                    }

                }
            }
        }
        System.out.println("Insertion successful.");
    }

}
