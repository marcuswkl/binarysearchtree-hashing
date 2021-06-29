package binarysearchtree;

import java.util.Scanner;

public class BSTTraversal {
    public void printTraversalMenu(){
        System.out.println("Select traversal option:");
        System.out.println("1. Pre-order traversal");
        System.out.println("2. In-order traversal");
        System.out.println("3. Post-order traversal");
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
                System.out.println("Out-Order Traversal: ");
                printPostOrder(node);
                break;
            default:
                break;
        }
    }

    public void printPreOrder(BSTTree.BSTNode node){
        System.out.print(node.value + ", ");
        printPreOrder(node.leftChild);
        printPreOrder(node.rightChild);
    }

    public void printInOrder(BSTTree.BSTNode node){
        printInOrder(node.leftChild);
        System.out.print(node.value + ", ");
        printInOrder(node.rightChild);
    }

    public void printPostOrder(BSTTree.BSTNode node){
        printPostOrder(node.leftChild);
        printPostOrder(node.rightChild);
        System.out.print(node.value + ", ");
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

    }

}
