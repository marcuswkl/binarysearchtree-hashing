package hashing;

public class HashingModel {

    int[] hashTable = {3, 7, 12, 21};

    public void printHashTable() {
        System.out.println("+-------+------------+");
        System.out.println("| Index |  Data Item |");
        System.out.println("+-------+------------+");

        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] < 10) {
                System.out.println("|     " + i + " |          " + hashTable[i] + " |");
            }
            else {
                System.out.println("|     " + i + " |         " + hashTable[i] + " |");
            }
        }
        System.out.println("+-------+------------+");
    }

}
