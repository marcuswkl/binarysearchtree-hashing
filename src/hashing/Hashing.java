package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        do {
            printMainMenu();
            int selectedOperation = getIntInput();
            performOperation(selectedOperation, hashMap);
        } while (true);
    }

    public static void printMainMenu() {
        System.out.println("Welcome to Hashing!");
        System.out.println("1. Insertion");
        System.out.println("2. Deletion");
        System.out.println("3. Search");
        System.out.println("0. Exit");
        System.out.println("Please input an integer (0 to 3) to select your desired operation.");
    }

    public static int getIntInput() {
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput.nextInt();
    }

    public static void performOperation(int intInput, HashMap<Integer, Integer> hashMap) {

        switch (intInput) {
            case 0:
                System.exit(0);
                break;
            case 1:
//                bstInsertion.insert(bst);
//                bst.printTree();
                break;
            case 2:
//                bstDeletion.delete(bst);
//                bst.printTree();
                break;
            case 3:
//                bstTraversal.getTraversal(bst);
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
    }
}
