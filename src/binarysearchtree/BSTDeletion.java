package binarysearchtree;

import java.util.ArrayList;

public class BSTDeletion {

    public class Node {
        Node left;
        Node right;
        Node root;

        public void insert(Node node, int data) {
        }

        public int getData(Node node, int data) {

            return data;
        }
    }

    public static ArrayList<Integer> delete(Node node, int data) {
        int root = bst.get(0);
        node.root.insert(node.root, root);

        node.left = null;
        node.right = null;
        if (data < bst.get(0)) {
            node.left.insert(node.left, data);
        } else {
            node.right.insert(node.right, data);
        }

        //first case: no child node/deleting leaf node
        if (node.left == null && node.right == null) {
            delete(node.root, data);
        }

        //second case: one child node
        if (node.left == null || node.right == null) {
            delete(node.root, data);
            if (data >= node.root.getData(node.root, data)) {
                node.insert(node.left, node.left.getData(node.left, data));
            } else {
                node.insert(node.right, node.right.getData(node.right, data));
            }
        }

        //third case: two child nodes
        if (node.left != null && node.right != null) {
            delete(node.root, data);
            for (int counter = 0; counter < bst.size(); counter++) {
                if (node.left.getData(node.left, data) >= node.root.getData(node.root, data)) {
                    node.root.insert(node.left, data);
                } else if (node.left.getData(node.right, data) <= node.root.getData(node.root, data)) {
                    node.root.insert(node.right, data);
                }
            }
        }

        return bst;
    }
}