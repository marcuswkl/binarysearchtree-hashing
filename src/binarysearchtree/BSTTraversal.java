package binarysearchtree;

import java.util.Scanner;

public class BSTTraversal {
    public void printTraversalMenu(){
        System.out.println("Select traversal option:");
        System.out.println("1. Pre-order traversal");
        System.out.println("2. In-order traversal");
        System.out.println("3. Post-order traversal");
        System.out.println("Please input an integer (1 to 3).");

    }

    public int getTraversalOption(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public void printTraversal(int input, BSTTree.BSTNode node){
        switch (input){
            case 1:
                System.out.print("Pre-Order Traversal: ");
                printPreOrder(node);
                break;
            case 2:
                System.out.println("In-Order Traversal: ");
                printInOrder(node);
                break;
            case 3:
                System.out.println("Post-Order Traversal: ");
                printPostOrder(node);
                break;
            default:
                break;
        }
    }

    public void printPreOrder(BSTTree.BSTNode node){
        if (node == null) {
            return;
        }
        System.out.print(node.value + " "); // print the node value
        printPreOrder(node.leftChild); // recur on the left child
        printPreOrder(node.rightChild); // recur on the right child
    }

    public void printInOrder(BSTTree.BSTNode node){
        if (node == null) {
            return;
        }
        printInOrder(node.leftChild); // recur on the left child
        System.out.print(node.value + " "); // print the node value
        printInOrder(node.rightChild); // recur on the right child
    }

    public void printPostOrder(BSTTree.BSTNode node){
        if (node == null) {
            return;
        }
        printPostOrder(node.leftChild); // recur on the left child
        printPostOrder(node.rightChild); // recur on the right child
        System.out.print(node.value + " "); // print the node value
    }

    public void getTraversal(BSTTree bst){
        printTraversalMenu();
        int traversalOption = getTraversalOption();
        if (bst != null) {
            printTraversal(traversalOption, bst.root);
        }
        else{
            System.out.println("Please insert the node in the tree.");
        }
        System.out.println();

    }

}
