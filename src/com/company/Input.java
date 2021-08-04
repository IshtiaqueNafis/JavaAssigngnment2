package com.company;

import java.util.Scanner;

public class Input {
    //region properties
    private final Scanner input;

    //endregion

    //region constructor
    public Input() {
        input = new Scanner(System.in);
    }
    //endregion

    //region methods for integer and string
    public String GetUserInput() {
        String sInput = input.nextLine();
        if ((StringInput(sInput))) {
            return sInput.toLowerCase(); // lowercases everything
        }
        return "LIOVJWGPEW"; // created randomly genereated text so it does not relate to any word
    }


    public int GetIntInput() { // this for integer input
        String sInput = input.nextLine();
        if (CheckForInteger(sInput)) { // if true
            return Integer.parseInt(sInput); // convert to integer.
        }
        return -1;
    }
    //endregion

    //region helper method for checking string and input
    private boolean CheckForInteger(String word) {
        if (word.length() > 1) return false; // make sure word is no longer than 1 character
        return Character.isDigit(word.charAt(0)); // this make sure word is a number
    }

    private boolean StringInput(String word) {
        return word.matches("[a-zA-Z][a-zA-Z ]*"); // input must follow in this order where space is allowed by a character.
    }
//endregion

}
