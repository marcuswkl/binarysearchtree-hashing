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

        public StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder sb) {
            if(rightChild!=null) {
                rightChild.toString(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
            }
            sb.append(prefix).append(isTail ? "└── " : "┌── ").append(Integer.toString(value)).append("\n");
            if(leftChild!=null) {
                leftChild.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
            }
            return sb;
        }

    }

    BSTNode root;

    public BSTTree() {
        root = null;
    }

}