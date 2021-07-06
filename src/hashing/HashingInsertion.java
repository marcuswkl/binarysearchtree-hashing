package hashing;

import java.util.Scanner;

public class HashingInsertion {

    public void printInsertMenu() {
        System.out.println("Please input a list of 10 positive integers (0 to 99) separated by commas with a space.");
        System.out.println("For example: 26, 32, 19, 11, 35, 9");
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
        System.out.println("Collision Resolution Method");
        System.out.println("1. Open Addressing (Linear Probing)");
        System.out.println("2. Open Addressing (Quadratic Probing)");
        System.out.println("3. Open Addressing (Double Hashing)");
        System.out.println("Please input an integer (1 to 3) to select your desired operation.");

        return getIntInput();
    }

    public void insert(HashingModel hashingModel) {
        printInsertMenu();
        int[] insertionInput = getInsertionInput();
        switch (selectCollisionMethod()) {
            case 1:
                openAddressing(hashingModel, insertionInput);
                break;
            case 2:
                quadraticProbing(hashingModel, insertionInput);
                break;
            case 3:
                doubleHashing(hashingModel, insertionInput);
                break;
            default:
                System.out.println("Invalid method selected.");
                break;
        }
    }

    public void openAddressing(HashingModel hashingModel, int[] insertionInput) {
        System.out.println("Open Addressing (Linear Probing)");
        int index;
        for (int key : insertionInput) {
            index = hashFunction(key, hashingModel.tableSize);

            while (hashingModel.hashTable[index] != -1) {
                System.out.println("Collision occurs when inserting " + key + " into " + index + ".");
                index++;
                // Reset index to 0 if reached last index in hash table
                index %= hashingModel.tableSize;
            }

            hashingModel.hashTable[index] = key;
        }
    }

    public void quadraticProbing(HashingModel hashingModel, int[] insertionInput) {
        System.out.println("Open Addressing (Quadratic Probing)");
        int index;
        for (int key : insertionInput) {
            index = hashFunction(key, hashingModel.tableSize);

            if (hashingModel.hashTable[index] == -1) {
                hashingModel.hashTable[index] = key;
            } else {
                System.out.println("Collision occurs when inserting " + key + " into " + index + ".");
                for (int i = 0; i < hashingModel.tableSize; i++) {
                    int t = (index + i * i) % hashingModel.tableSize;

                    if (hashingModel.hashTable[t] == -1) {
                        hashingModel.hashTable[t] = key;
                        break;
                    }
                }
            }
        }
    }

    public void doubleHashing(HashingModel hashingModel, int[] insertionInput) {
        System.out.println("Open Addressing (Double Hashing)");
        int index;
        for (int key : insertionInput) {
            index = hashFunction(key, hashingModel.tableSize);
            int stepSize = doubleHashFunction(key);

            while (hashingModel.hashTable[index] != -1) {
                System.out.println("Collision occurs when inserting " + key + " into " + index + ".");
                index += stepSize;
                // Reset index to 0 if reached last index in hash table
                index %= hashingModel.tableSize;
            }

            hashingModel.hashTable[index] = key;
        }
    }

    public int hashFunction(int key, int tableSize) {
        return key % tableSize;
    }

    public int doubleHashFunction(int key) {
        return 5 - (key % 5);
    }

}
