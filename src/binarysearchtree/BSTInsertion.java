package binarysearchtree;

import java.util.Scanner;

public class BSTInsertion {

    public void printInsertMenu() {
        System.out.println("Please input a list of integers separated by commas with a space.");
        System.out.println("For example: 1, 2, 3, 4, 5");
    }

    public int[] getInsertionInput() {
        Scanner keyboardInput = new Scanner(System.in);
        String stringInput = keyboardInput.nextLine();
        String[] stringArray = stringInput.split(", ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public void insert(BSTTree bst) {
        printInsertMenu();
        int[] insertionInput = getInsertionInput();

        if (bst.root == null) {
            System.out.println("Tree is empty.");
            bst.root = new BSTTree.BSTNode(insertionInput[0]);
            BSTTree.BSTNode currentNode = bst.root;

            for (int i = 1; i < insertionInput.length; i++) {
//                while (true) {
                    if (insertionInput[i] < currentNode.value) {
                        if (currentNode.leftChild != null) {
                            currentNode = currentNode.leftChild;
                        } else {
                            currentNode.leftChild = new BSTTree.BSTNode(insertionInput[i]);
                        }
                    } else {
                        if (currentNode.rightChild != null) {
                            currentNode = currentNode.rightChild;
                        } else {
                            currentNode.rightChild = new BSTTree.BSTNode(insertionInput[i]);
                        }
                    }
//                }
            }
        } else {
            BSTTree.BSTNode currentNode = bst.root;

            for (int i = 0; i < insertionInput.length; i++) {
                while (true) {
                    if (insertionInput[i] < currentNode.value) {
                        if (currentNode.leftChild != null) {
                            currentNode = currentNode.leftChild;
                        } else {
                            currentNode.leftChild = new BSTTree.BSTNode(insertionInput[i]);
                        }
                    } else {
                        if (currentNode.rightChild != null) {
                            currentNode = currentNode.rightChild;
                        } else {
                            currentNode.rightChild = new BSTTree.BSTNode(insertionInput[i]);
                        }
                    }
                }
            }
        }
        System.out.println("Insertion successful.");
    }

}
