package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead {
    //region properties
    public HashTable hashTable;

    //endregion
    //region constructor
    public FileRead(HashTable hashTable) {
        this.hashTable = hashTable;
    }

    //endregion
    //region reading from file method
    public boolean readFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                hashTable.addNewWord(new Word(line));

            }
            return true;

        } catch (Exception e) {
            System.out.println("error reading from a file....");
        }
        return false;
    }
 //endregion

}
