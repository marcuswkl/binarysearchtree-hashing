package hashing;

import java.util.Scanner;

public class HashingDeletion {

    int[] testdata = {5, 3, 25, 68};


    public void delete(){
        int deleteKey = getDeletionInput();
    }

    public int getDeletionInput(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    // take in key array
    // search for the key value
    // remove
    public void performDeletion(HashingModel hashingModel, int deleteKey){
        for (int i = 0; i<hashingModel.hashTable.length;i++){
            while(hashingModel.hashTable[i] == deleteKey){
                hashingModel.hashTable[i] = null;
                System.out.println(deleteKey + "is deleted.");
            }
        }
    }





}
