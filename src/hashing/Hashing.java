package hashing;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        HashingModel hashingModel = new HashingModel();

        do {
            printMainMenu();
            int selectedOperation = getIntInput();
            performOperation(selectedOperation, hashingModel);
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

    public static void performOperation(int intInput, HashingModel hashingModel) {

        switch (intInput) {
            case 0:
                System.exit(0);
                break;
            case 1:
//                hashingInsertion.insert(hash);
                hashingModel.printHashTable();
                break;
            case 2:
//                hashingDeletion.delete(hash);
//                bst.printTree();
                break;
            case 3:
//                hashingSearch.search(hashTable);
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
    }
}
