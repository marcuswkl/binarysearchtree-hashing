package binarysearchtree;

public class BinarySearchTree {
    public static void main(String[] args) {
        BSTMenu bstMenu = new BSTMenu();
        bstMenu.printMainMenu();
        int selectedOperation = bstMenu.getIntInput();
    }
}
