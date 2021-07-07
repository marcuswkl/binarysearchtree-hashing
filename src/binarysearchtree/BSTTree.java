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

        public String printTree() {
            return this.printTree(new StringBuilder(), true, new StringBuilder()).toString();
        }

        public StringBuilder printTree(StringBuilder TreeConstructor, boolean existAsLast, StringBuilder sb) {
            if(rightChild!=null) {
                rightChild.printTree(new StringBuilder().append(TreeConstructor).append(existAsLast ? "│   " : "    "), false, sb);
            }
            sb.append(TreeConstructor).append(existAsLast ? "└── " : "┌── ").append(Integer.toString(value)).append("\n");
            if(leftChild!=null) {
                leftChild.printTree(new StringBuilder().append(TreeConstructor).append(existAsLast ? "    " : "│   "), true, sb);
            }
            return sb;
        }

    }

    BSTNode root;

    public BSTTree() {
        root = null;
    }

}