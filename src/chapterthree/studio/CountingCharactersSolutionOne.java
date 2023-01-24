package chapterthree.studio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CountingCharactersSolutionOne {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nHello world!");
            System.out.println("\nLet's count characters! What line would you like to count each character of?");
            String userString = input.nextLine();
            input.close();
            String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";
            HashMap<String, Integer> result = countCharacters(userString);
            for (Map.Entry<String, Integer> entry : result.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }

        public static HashMap<String, Integer> countCharacters (String text) {
            HashMap<String, Integer> charMap = new HashMap<String, Integer>();
            String[] charArray = text.toLowerCase().split("");
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            for (String eaChar: charArray) {
                if (alphabet.contains(eaChar)) {
                    if (!charMap.containsKey(eaChar)) {
                        charMap.put(eaChar,1);
                    } else {
                        charMap.put(eaChar,charMap.get(eaChar) +1);
                    }
                }
            }
            return charMap;
        }
    }
