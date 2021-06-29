package binarysearchtree;

import java.util.ArrayList;
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

    public getTraversal(int input, ArrayList<Integer> data){
        switch (input){
            case 1:
                System.out.println("Pre-Order Traversal");
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

}
