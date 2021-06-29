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
    
}
