package chapterthree.exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbersArray = {1, 1, 2, 3, 5, 8};
            for (int i : numbersArray) {
            //System.out.println(i);
                if ( i % 2 != 0) {
                    System.out.println(i);
                }
            }
        String suess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
           /*
           String[] words = suess.split(" ");
           System.out.println(Arrays.toString(words));
           */
            String[] sentences = suess.split("\\.");
            System.out.println(Arrays.toString(sentences));
         }
    }
