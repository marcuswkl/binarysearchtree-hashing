package binarysearchtree;

import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
        BSTTree bst = new BSTTree();

        do {
            printMainMenu();
            int selectedOperation = getIntInput();
            performOperation(selectedOperation, bst);
        } while (true);
    }

    public static void printMainMenu() {
        System.out.println("Welcome to Binary Search Tree!");
        System.out.println("1. Insertion");
        System.out.println("2. Deletion");
        System.out.println("3. Traversal");
        System.out.println("0. Exit");
        System.out.println("Please input an integer to select your desired operation.");
    }

    public static int getIntInput() {
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput.nextInt();
    }

    public static void performOperation(int intInput, BSTTree bst) {
        BSTInsertion bstInsertion = new BSTInsertion();
        BSTDeletion bstDeletion = new BSTDeletion();
        BSTTraversal BSTTraversal = new BSTTraversal();

        switch (intInput) {
            case 0:
                System.exit(0);
                break;
            case 1:
                bstInsertion.insert(bst);
                bst.printTree();
                break;
            case 2:
                System.out.println("Call deletion method");
                bst.printTree();
                break;
            case 3:
                System.out.println("Call traversal method");
                break;
        }
    }

}

