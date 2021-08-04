package com.company;

import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        var hash = new HashTable(1303);
        ProgramOperations operations = new ProgramOperations(hash); // making the hash table 1.3X larger than inteded word so the word has 1303 items. so the hastable is 80%full.

        System.out.println(operations.getMenu().Loading());

        operations.getFileRead().readFromFile("wordList.txt");

        boolean programIsRunning = true;

        do {
            System.out.println(operations.getMenu().ShowMenu());
            int input;
            while (true) {
                try {
                    input = operations.getInput().GetIntInput();
                    if (input >= 1 && input <= 4) {
                        break;
                    }
                    System.out.println("must enter between 1 and 4 ");
                } catch (StringIndexOutOfBoundsException ex) {
                    System.out.println("error with input");

                }

            }  if (input < 4) {
                System.out.println(operations.spellCheckerOperations(input));
            } else {
                System.out.println("program will now exist");
                programIsRunning=false;
            }


        } while (programIsRunning);


    }
}

