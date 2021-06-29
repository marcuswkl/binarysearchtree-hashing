package binarysearchtree;

import java.util.ArrayList;
import java.util.Scanner;

public class BSTInsertion {

    public void printInsertMenu() {
        System.out.println("Please input a list of integers separated by commas with a space.");
        System.out.println("For example: 1, 2, 3, 4, 5");
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

    public void insert(ArrayList<Integer> bst) {
        printInsertMenu();
        int[] insertionInput = getInsertionInput();
        for (int insertionInputElement : insertionInput) {
            bst.add(insertionInputElement);
        }
    }

}
