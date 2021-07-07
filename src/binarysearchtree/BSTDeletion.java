package binarysearchtree;
import java.util.Scanner;
public class BSTDeletion {

    public int getDeletionInput() {
        System.out.println("Please input the integer you want to delete.");
        System.out.println("Note 1: You can only delete one integer at a time.");
        System.out.println("Note 2: The integer must exist in the current BST.");
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput.nextInt();
    }

    public void delete(BSTTree bst) {
        int deletionInput = getDeletionInput();
        performDeletion(bst.root, deletionInput);
    }

    BSTTree.BSTNode performDeletion(BSTTree.BSTNode currentNode, int deletionInput) {
        // recursive function to find out the position of the current node
        if (deletionInput < currentNode.value)
            currentNode.leftChild = performDeletion(currentNode.leftChild, deletionInput);
        else if (deletionInput > currentNode.value)
            currentNode.rightChild = performDeletion(currentNode.rightChild, deletionInput);
        else {
            // First Case: Current Node is leaf node
            // Second Case: Current Node has a left Child
            // Third Case: Current Node has a right Child
            if (currentNode.leftChild == null)
                return currentNode.rightChild;
            else if (currentNode.rightChild == null)
                return currentNode.leftChild;
            // Fourth Case: Current Node has both left and right Child
            currentNode.value = smallestValue(currentNode.rightChild);
            currentNode.rightChild = performDeletion(currentNode.rightChild, currentNode.value);
        }
        return currentNode;
    }

    public int smallestValue(BSTTree.BSTNode currentNode) {
        // To search the largest value on the right subtree of the current node
        int smallestData = currentNode.value;
        while (currentNode.leftChild != null) {
            smallestData = currentNode.leftChild.value;
            currentNode = currentNode.leftChild;
        }
        return smallestData;
    }
}
