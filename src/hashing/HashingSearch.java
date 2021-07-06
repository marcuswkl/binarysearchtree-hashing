package hashing;
import java.util.Scanner;

public class HashingSearch {
    public int getSearchInput() {
        System.out.println("Please input the integer you want to search.");
        System.out.println("Note: You can only search one integer at a time.");
        Scanner keyboardInput = new Scanner(System.in);
        int intInput = keyboardInput.nextInt();
        return intInput;
    }

    public void search(HashingModel hashingModel) {
        int searchInput = getSearchInput();
        findInput(hashingModel, searchInput);
    }

    public int findInput(HashingModel hashingModel, int searchInput) {
        int arrayIndex = searchInput % hashingModel.hashTable.length;
        while (hashingModel.hashTable[arrayIndex] != -1) {
            if (hashingModel.hashTable[arrayIndex] == searchInput) {
                System.out.println(searchInput + " was found in the index " + arrayIndex);
                return hashingModel.hashTable[arrayIndex];
            }
            ++arrayIndex;
            arrayIndex %= hashingModel.hashTable.length;
        }
        System.out.println("The number is not in the hash table.");
        return -1;
    }
}
