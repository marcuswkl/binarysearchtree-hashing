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

//    public void printTree() {
//    }

/*    public void printOneNodeTree() {
        if (root == null) {
            System.out.println("The tree is empty.");
        } else {
            System.out.println(root.value);
        }
    }

    public void printTwoNodeTree() {

    }*/

    public void printBalancedThreeNodeTree() {
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
                } else if (currentNode.leftChild != null && currentNode.rightChild != null) {
                    System.out.println("    /       \\");
                    System.out.println(currentNode.leftChild.value + "              "
                            + currentNode.rightChild.value);
                }
            }
        }
    }
}