package chapterthree.studio;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class CountingCharacters {
    public static void main(String[] args) {
        String dialogue = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the" +
                " quadratics into a form that can be factored allowing that side of the equation to equal zero. Once" +
                " you’ve done that, it’s pretty straightforward from there.";
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

        /*
        int wordCount = 0;
        int symbolCount = 0;
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            for (int i = 0; i < dialogue.length(); i++) {
                if (dialogue.charAt(i) == letter) {
                    wordCount++;
                }
            }
            if (wordCount > 0) {
                System.out.println(letter + ":" + wordCount);
                wordCount = 0;
            }
        }
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int i = 0; i < dialogue.length(); i++) {
                if (dialogue.charAt(i) == letter) {
                    wordCount++;
                }
            }
            if (wordCount > 0) {
                System.out.println(letter + ":" + wordCount);
                wordCount = 0;
            }
        }
        for (char symbol = ' '; symbol <= '?'; symbol++) {
            for (int i = 0; i < dialogue.length(); i++) {
                if (dialogue.charAt(i) == symbol) {
                    symbolCount++;
                }
            }
            if (symbolCount > 0) {
                System.out.println(symbol + ":" + symbolCount);
                symbolCount = 0;
            }
        }
        HashMap<Character, Integer> charCount = new HashMap<>();
        charCount.put('I', 1);
        charCount.put('O', 1);
        charCount.put('S', 1);
        charCount.put('a', 20);
        charCount.put('b', 2);
        charCount.put('c', 7);
        charCount.put('d', 7);
        charCount.put('e', 32);
        charCount.put('f', 9);
        charCount.put('g', 2);
        charCount.put('h', 13);
        charCount.put('i', 11);
        charCount.put('l', 6);
        charCount.put('m', 8);
        charCount.put('n', 12);
        charCount.put('o', 31);
        charCount.put('p', 3);
        charCount.put('q', 3);
        charCount.put('r', 18);
        charCount.put('s', 16);
        charCount.put('t', 38);
        charCount.put('u', 8);
        charCount.put('v', 3);
        charCount.put('w', 5);
        charCount.put('y', 5);
        charCount.put('z', 3);
        charCount.put(' ', 66);
        charCount.put(',', 2);
        charCount.put('.', 3);

        System.out.println(charCount);
         */
    }
