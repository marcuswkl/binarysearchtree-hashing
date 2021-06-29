package binarysearchtree;

public class BSTTree {

    public static class BSTNode {
        int value;
        BSTNode leftChild, rightChild = null;

        public BSTNode(int value) {
            this.value = value;
        }

    }

    BSTNode root = null;

    public void printTree() {
        System.out.println(root.value);
    }

}
