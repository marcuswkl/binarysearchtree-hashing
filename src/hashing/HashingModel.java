package hashing;

import java.util.Arrays;

public class HashingModel {

    int[] hashTable;
    int tableSize;

    public HashingModel(int tableSize) {
        this.tableSize = tableSize;
        hashTable = new int[tableSize];
        // Fill table with -1 that represent empty values because value cannot be null
        Arrays.fill(hashTable, -1);
    }

    public void printHashTable() {
        System.out.println("+-------+------------+");
        System.out.println("| Index |  Data Item |");
        System.out.println("+-------+------------+");

        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] >= 0 && hashTable[i] <= 9 ) {
                System.out.println("|     " + i + " |          " + hashTable[i] + " |");
            }
            else if (hashTable[i] >= 10) {
                System.out.println("|     " + i + " |         " + hashTable[i] + " |");
            }
            else if (hashTable[i] == -1) {
                System.out.println("|     " + i + " |            |");
            }
        }
        System.out.println("+-------+------------+");
    }

}
