package hashing;

import java.util.Scanner;

public class HashingInsertion {

    public void printInsertMenu() {
        System.out.println("Please input a list of integers (0 to 99) separated by commas with a space.");
        System.out.println("For example: 61, 25, 54, 92, 13");
    }

    public int[] getInsertionInput() {
        Scanner keyboardInput = new Scanner(System.in);
        String stringInput = keyboardInput.nextLine();
        String[] stringArray = stringInput.split(", ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public static int getIntInput() {
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput.nextInt();
    }

    public int selectCollisionMethod() {
        System.out.println("Collision Resolution Methods");
        System.out.println("1. Open Addressing - Linear Probing");
        System.out.println("2. Open Addressing - Quadratic Probing");
        System.out.println("3. Open Addressing - Double Hashing");
        System.out.println("4. Separate Chaining");
        System.out.println("Please input an integer (1 to 4) to select your desired operation.");

        return getIntInput();
    }

    public void insert(HashingModel hashingModel) {
        printInsertMenu();
        int[] insertionInput = getInsertionInput();
        switch (selectCollisionMethod()) {
            case 1:
                linearProbing(hashingModel, insertionInput);
                break;
            case 2:
                quadraticProbing(hashingModel, insertionInput);
                break;
            case 3:
                doubleHashing(hashingModel, insertionInput);
                break;
            case 4:
                separateChaining(hashingModel, insertionInput);
                break;
            default:
                System.out.println("Invalid method selected.");
                break;
        }
    }

    public void linearProbing(HashingModel hashingModel, int[] insertionInput) {
        System.out.println("Linear Probing");
    }
    
    public void quadraticProbing(HashingModel hashingModel, int[] insertionInput) {
        System.out.println("Quadratic Probing");
    }

    public void doubleHashing(HashingModel hashingModel, int[] insertionInput) {
        System.out.println("Double Hashing");
    }

    public void separateChaining(HashingModel hashingModel, int[] insertionInput) {
        System.out.println("Separate Chaining");
    }

}
