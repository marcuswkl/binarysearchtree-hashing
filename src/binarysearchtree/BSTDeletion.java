package binarysearchtree;

public class BSTDeletion {

    public void printDeleteMenu() {
        System.out.println("Please input the integer you want to delete.");
        System.out.println("Note: You can only delete one integer at a time.");
    }
/*
   public static BSTTree delete(BSTTree.BSTNode node, int data) {

        //first case: no child node/deleting leaf node
        if (node.leftChild == null && node.rightChild == null) {
            delete(node, data);
        }

        //second case: one child node
        if (node.leftChild == null || node.rightChild == null) {
            delete(node, data);
            if (data >= node.getData(node, data)) {
                node.insert(node.leftChild, node.leftChild.getData(node.leftChild, data));
            } else {
                node.insert(node.rightChild, node.rightChild.getData(node.rightChild, data));
            }
        }

        //third case: two child nodes
        if (node.leftChild != null && node.rightChild != null) {
            delete(node, data);
            for (int counter = 0; counter < bst.size(); counter++) {
                if (node.leftChild.getData(node.leftChild, data) >= node.getData(node, data)) {
                    node.insert(node.leftChild, data);
                } else if (node.leftChild.getData(node.rightChild, data) <= node.getData(node, data)) {
                    node.insert(node.rightChild, data);
                }
            }
        }

        return bst;
    }*/
}