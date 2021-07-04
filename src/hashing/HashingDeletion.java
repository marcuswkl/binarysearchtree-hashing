package hashing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HashingDeletion {

    public void delete(HashingModel hashingModel){
        int deleteKey = getDeletionInput();
        boolean ifExist = Arrays.stream(hashingModel.hashTable).anyMatch(x -> x == deleteKey);

        while(ifExist) {
            for (int i=0; i<hashingModel.hashTable.length;i++){
                if (hashingModel.hashTable[i] == deleteKey){
                    hashingModel.hashTable[i] = -1;
                    System.out.println(deleteKey + " is deleted.");
                    break;
                }
            }
        }
        System.out.println("The number is not in the hash table");
    }



    public int getDeletionInput(){
        System.out.println("Please input the integer you want to delete.");
        System.out.println("Note: You can only delete one integer at a time.");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}
