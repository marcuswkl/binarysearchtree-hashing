package binarysearchtree;

public class BinarySearchTree {
    public static void main(String[] args) {
        BSTMenu bstMenu = new BSTMenu();
        do {
            bstMenu.printMainMenu();
            int selectedOperation = bstMenu.getIntInput();
            bstMenu.performOperation(selectedOperation);
        } while(true);
    }
}
