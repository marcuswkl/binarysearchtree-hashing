package binarysearchtree;

import java.util.Scanner;


public class BSTDeletion {

    public int getDeletionInput() {
        System.out.println("Please input the integer you want to delete.");
        System.out.println("Note: You can only delete one integer at a time.");
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput.nextInt();
    }

    public void delete(BSTTree bst) {
        int deletionInput = getDeletionInput();
        performDeletion(deletionInput, bst);
    }

    public boolean performDeletion(int deletionInput, BSTTree bst) {
        BSTTree.BSTNode currentNode = bst.root;
        BSTTree.BSTNode parentNode = bst.root;

        boolean existAsLeftChild = true;

        while (currentNode.value != deletionInput) {
            parentNode = currentNode;
            if (deletionInput < currentNode.value) {
                existAsLeftChild = true;
                currentNode = currentNode.leftChild;
            } else {
                existAsLeftChild = false;
                currentNode = currentNode.rightChild;
            }
            if (currentNode == null){
                return false;
            }
        }

        if (currentNode.leftChild == null && currentNode.rightChild == null) {
            if (currentNode == bst.root) {
                bst.root = null;
            } else if (existAsLeftChild) {
                parentNode.leftChild = null;
            } else {
                parentNode.rightChild = null;
            }
        } else if (currentNode.rightChild == null) {
            if (currentNode == bst.root) {
                bst.root = currentNode.leftChild;
            } else if (existAsLeftChild) {
                parentNode.leftChild = currentNode.leftChild;
            } else {
                parentNode.rightChild = currentNode.leftChild;
            }
        } else if (currentNode.leftChild == null) {
            if (currentNode == bst.root) {
                bst.root = currentNode.rightChild;
            } else if (existAsLeftChild) {
                parentNode.leftChild = currentNode.rightChild;
            } else {
                parentNode.rightChild = currentNode.rightChild;
            }
        } else {
            BSTTree.BSTNode replacement = getReplacementNode(currentNode);
            if (currentNode == bst.root) {
                bst.root = replacement;
            } else if (existAsLeftChild) {
                parentNode.leftChild = replacement;
            } else {
                parentNode.rightChild = replacement;
                replacement.leftChild = currentNode.leftChild;
            }

        }
        return true;
    }

    public BSTTree.BSTNode getReplacementNode(BSTTree.BSTNode replacement) {
        BSTTree.BSTNode replacementParentNode = replacement;
        BSTTree.BSTNode replacementValue = replacement;
        BSTTree.BSTNode currentNode = replacement.rightChild;
        while (currentNode != null) {
            replacementParentNode = replacementValue;
            replacementValue = currentNode;
            currentNode = currentNode.leftChild;
        }
        if (replacementValue != replacement.rightChild) {
            replacementParentNode.leftChild = replacementValue.rightChild;
            replacementValue.rightChild = replacement.rightChild;
        }
        return replacement;
    }
}




 /*      if (deletionInput == bst.root.value){
            performDeletion(bst.root);
        }
        else if (deletionInput > bst.root.value){
                if (deletionInput == bst.root.rightChild.value) {
                    performDeletion(bst.root.rightChild);
                    if(bst.root.rightChild==null){
                        System.out.println("The node is deleted");
                    } else {
                        System.out.println("The node is not deleted");
                    }
                } else if (deletionInput >= bst.root.rightChild.value) {
                    performDeletion(bst.root.rightChild.rightChild);
                } else if (deletionInput < bst.root.leftChild.value) {
                    performDeletion(bst.root.rightChild.leftChild);
                } else {
                    System.out.println("The node is not deleted");
                }
            } else if (deletionInput >= bst.root.rightChild.value) {
                performDeletion(bst.root.rightChild.rightChild);
            } else if (deletionInput < bst.root.leftChild.value) {
                performDeletion(bst.root.rightChild.leftChild);
            } else {
                System.out.println("The number is not found in the Binary Search Tree");
            }
        } else {
            if (deletionInput == bst.root.leftChild.value) {
                performDeletion(bst.root.leftChild);
            } else if (deletionInput > bst.root.leftChild.value) {
                performDeletion(bst.root.leftChild.rightChild);
            } else if (deletionInput < bst.root.leftChild.value) {
                performDeletion(bst.root.leftChild.leftChild);
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

    public BSTTree.BSTNode performDeletion(BSTTree.BSTNode node) {
        //first case: no child node/deleting leaf node
        if (node.leftChild == null && node.rightChild == null) {
            System.out.println("This is a leaf node.");
            //node = null;
            return null;
        }

        //second case: one left child node
        else if (node.leftChild != null && node.rightChild == null) {
            System.out.println("This node has one left child.");
            System.out.println("The node is replaced by its left child.");
            node.value = node.leftChild.value;
            node.leftChild = null;
        }

        //third case: one right child node
        else if (node.rightChild != null && node.leftChild == null) {
            System.out.println("This node has one right child.");
            System.out.println("The node is replaced by its right child.");
            node.value = node.rightChild.value;
            node.rightChild = null;
        }

        //third case: two child nodes // (node.leftChild != null && node.rightChild != null)
        else {
            System.out.println("The node is replaced.");
            BSTTree.BSTNode smallestRight = smallestNumber(node.leftChild);
            node.value = smallestRight.value;
            node.leftChild = null;
        }
        return node;
    }
}


    public boolean inputExist(BSTTree.BSTNode node, int deletionInput) {
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
