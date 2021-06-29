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

    public void getTraversal(int input, BSTTree.BSTNode node){
        switch (input){
            case 1:
                System.out.println("Pre-Order Traversal");
                // node.value + node.left + node.right

                break;
            case 2:
                System.out.println("In-Order Traversal");
                break;
            case 3:
                System.out.println("Out-Order Traversal");
                break;
            default:
                break;
        }
    }

    public void traversal(BSTTree bst){
        printTraversalMenu();
        getTraversalOption();

    }


}
