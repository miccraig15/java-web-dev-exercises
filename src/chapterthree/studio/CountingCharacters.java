package chapterthree.studio;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class CountingCharacters {
    public static void main(String[] args) {
        String dialogue = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with.  So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. Once " +
                "you've done that, it's pretty straightforward from there.";
        String dialogueUpper = dialogue.toUpperCase();

        char[] charactersInString = dialogue.toCharArray();
        for (char c : charactersInString) {
//            System.out.println(c);
        }
        int wordCount = 0;
        int symbolCount = 0;
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            for (int i = 0; i < charactersInString.length; i++) {
                if (charactersInString[i] == letter) {
                    wordCount++;
                }
            }
            if (wordCount > 0) {
                System.out.println(letter + ":" + wordCount);
                wordCount = 0;
            }
        }
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int i = 0; i < charactersInString.length; i++) {
                if (charactersInString[i] == letter) {
                    wordCount++;
                }
            }
            if (wordCount > 0) {
                System.out.println(letter + ":" + wordCount);
                wordCount = 0;
            }
        }
        for (char symbol = ' '; symbol <= '?'; symbol++) {
            for (int i = 0; i < charactersInString.length; i++) {
                if (charactersInString[i] == symbol) {
                    symbolCount++;
                }
            }
            if (symbolCount > 0) {
                System.out.println(symbol + ":" + symbolCount);
                symbolCount = 0;
            }
        }
    }
}
