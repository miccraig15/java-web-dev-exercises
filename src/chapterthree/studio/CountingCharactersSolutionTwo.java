package chapterthree.studio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;

public class CountingCharactersSolutionTwo {
    public static void main(String[] args) throws IOException {
        //set up initial string
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has" +
                " to be zero to start with. So if you move all the terms over to one side, you can put the quadratics" +
                " into a form that can be factored allowing that side of the equation to equal zero. Once you've done" +
                " that, it's pretty straightforward from there.";

        String entry = promptForString();
        //if entry is blank, then we use default str above
        if(entry.equals("")) {
            entry = str;
        }

        System.out.println("Printing counts: ");
        HashMap<Character, Integer> counts = getCounts(entry);
        printCounts(counts);

        //attempt to use scanner to read data from file
        Scanner file = new Scanner(new File("c:\\users\\steve\\onedrive\\desktop\\unit 2 student group.txt"));
        //string to hold the file contents
        String fileText = "";

        //read while we have data
        while(file.hasNext()) {
            //read a line and add it to fileText
            fileText += file.nextLine();
        }
        //clean up scanner
        file.close();

        //fileText now contains the contents of the file as a single string
        System.out.println("\n\nNow reading the text from my file!");
        counts = getCounts(fileText);
        printCounts(counts);
    }

    public static HashMap<Character, Integer> getCounts(String str) {
        HashMap<Character, Integer> charCounts = new HashMap<>();

        //convert string to character array
        //updated string to be case-insensitive
        //remove non-alphabetic characters using replaceAll and a regex
        char[] charactersInString = str.toLowerCase().replaceAll("[^a-z]+","").toCharArray();

        //loop thru string and update hashmap
        for(char c: charactersInString) {
            //if character is not already in map, add it
            if(!charCounts.containsKey(c)) {
                charCounts.put(c, 1);
            } else {
                //character is already in map, update its count
                charCounts.put(c, charCounts.get(c) + 1);
            }
        }
        return charCounts;
    }

    public static void printCounts(HashMap<Character, Integer> map) {
        for (Map.Entry<Character, Integer> count : map.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }

    public static String promptForString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string (leave blank for default!):" );

        String retval = input.nextLine();
        input.close();
        return retval;
    }
}