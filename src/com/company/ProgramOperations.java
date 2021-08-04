package com.company;

import java.util.List;

public class ProgramOperations {
    //region properties
    private final HashTable hashTable;
    private final Input input;
    private final Menu menu;
    private final FileRead fileRead;

    //endregion
    //region getter
    public FileRead getFileRead() {
        return fileRead;
    }

    public Input getInput() {
        return input;
    }

    public Menu getMenu() {
        return menu;
    }

    //endregion
//region constructor
    public ProgramOperations(HashTable hashTable) {
        this.hashTable = hashTable;
        input = new Input();
        menu = new Menu();
        fileRead = new FileRead(hashTable);
    }

    //endregion

    //region mainOperations
    public String spellCheckerOperations(int number) {
        String wordSentence;
        if (number == 1) {
            while (true) {
                System.out.println("Please enter an word to add to the hashtable ");
                wordSentence = input.GetUserInput();
                if (!wordSentence.equals("LIOVJWGPEW")) { // created a random string to make sure it does not enter the input.
                    break;
                }
                System.out.println("error with input occurred");
            }
            return addNewWord(wordSentence);
        }
        if (number == 2) {
            while (true) {
                System.out.println("Please enter an word to delete from the hashtable ");
                wordSentence = input.GetUserInput();
                if (!wordSentence.equals("LIOVJWGPEW")) {
                    break;
                }
                System.out.println("error with input occurred");
            }
            return DeleteWord(wordSentence);

        } else {
            while (true) {
                System.out.println("Please enter input followed by spaces ");
                wordSentence = input.GetUserInput();
                if (!wordSentence.equals("LIOVJWGPEW")) {
                    break;
                }
                System.out.println("error with input occurred");
            }
            return CheckSentence(wordSentence);
        }
    }
    //endregion
//region privatemethods for adding,deleting and checking for sentence

    private String addNewWord(String word) {
        return hashTable.addNewWord(new Word(word)) ? "Successful adding" : "Either" +word+" already on the List or Table is full ";
    }

    private String DeleteWord(String word) {
        return hashTable.deleteWord(new Word(word)) ? "Deletion Successful" : "No such word exists deletion is impossible";
    }

    private String CheckSentence(String sentences) {
        List<Word> notListedWords = hashTable.checkSentence(sentences);
        return notListedWords.size() == 0 ? sentences + " you entered all matches the hashtable" : "here are the list of word not in hashtable " + printListWords(notListedWords);

    }

    private String printListWords(List<Word> words) {
        StringBuilder output = new StringBuilder("Here are the list of words not in hashtable").append("\n");
        for (var word : words) {
            output.append(word).append("\n");

        }
        return String.valueOf(output);
    }
    //endregion
}
