package binarysearchtree;

public class BSTTree {

    public static class BSTNode {
        int value;
        BSTNode leftChild, rightChild;

        public BSTNode(int value) {
            this.value = value;
            leftChild = null;
            rightChild = null;
        }

    }

    BSTNode root;

    public BSTTree() {
        root = null;
    }

    public void printTree() {
        if (root == null) {
            System.out.println("The tree is empty.");
        } else {
            System.out.println("        " + root.value);
            BSTNode currentNode = root;
            for (int i = 0; i < 1; i++) {
                if (currentNode.leftChild != null && currentNode.rightChild == null) {
                    System.out.println("    /");
                    System.out.println(currentNode.leftChild.value);
                } else if (currentNode.leftChild == null && currentNode.rightChild != null) {
                    System.out.println("        \\");
                    System.out.println("        " + currentNode.rightChild.value);
                } else if (currentNode.leftChild != null && currentNode.rightChild != null){
                    System.out.println("    /       \\");
                    System.out.println(currentNode.leftChild.value + "              "
                            + currentNode.rightChild.value);
                }
            }
        }
    }

}
