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

        @Override
        public String toString() {
            return this.toString(new StringBuilder(), true, new StringBuilder()).toString();
        }

        public StringBuilder toString(StringBuilder TreeConstructor, boolean existAsLast, StringBuilder sb) {
            if(rightChild!=null) {
                rightChild.toString(new StringBuilder().append(TreeConstructor).append(existAsLast ? "│   " : "    "), false, sb);
            }
            sb.append(TreeConstructor).append(existAsLast ? "└── " : "┌── ").append(Integer.toString(value)).append("\n");
            if(leftChild!=null) {
                leftChild.toString(new StringBuilder().append(TreeConstructor).append(existAsLast ? "    " : "│   "), true, sb);
            }
            return sb;
        }

    }

    BSTNode root;

    public BSTTree() {
        root = null;
    }

}