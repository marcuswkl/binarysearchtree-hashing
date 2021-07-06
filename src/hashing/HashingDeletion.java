package hashing;

import java.util.Scanner;

public class HashingDeletion {

    public void delete(HashingModel hashingModel){
        int deleteKey = getDeletionInput();
        boolean exists = checkIfExist(hashingModel,deleteKey);
        if(exists){
            performDeletion(hashingModel,deleteKey);
        } else {
            System.out.println("The number is not in the hash table");
        }
    }

    public int getDeletionInput(){
        System.out.println("Please input the integer you want to delete.");
        System.out.println("Note: You can only delete one integer at a time.");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public boolean checkIfExist(HashingModel hashingModel, int deleteKey) {
        for(int i=0; i<hashingModel.hashTable.length; i++){
            if (hashingModel.hashTable[i] == deleteKey)
                return true;
        }
        return false;
    }

    public void performDeletion(HashingModel hashingModel, int deleteKey){
        for (int i=0; i<hashingModel.hashTable.length; i++){
            if (hashingModel.hashTable[i] == deleteKey){
                hashingModel.hashTable[i] = -1;
                System.out.println(deleteKey + " is deleted.");
            }
        }
    }

}
