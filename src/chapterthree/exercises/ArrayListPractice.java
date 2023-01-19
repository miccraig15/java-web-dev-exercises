package chapterthree.exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList<String> wordPrint(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> wordBank = new ArrayList<>();
        System.out.println("Enter a word length (2, 3, 4, 5, or 6): ");
        int numChars = input.nextInt();
        for (String String : arr) {
            if (String.length() == numChars) {
                wordBank.add(String);
            }
        }
        return wordBank;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println(sumEven(numbers));

        ArrayList<String> words = new ArrayList<>();
        words.add("to");
        words.add("at");
        words.add("fly");
        words.add("see");
        words.add("talk");
        words.add("walk");
        words.add("slice");
        words.add("filet");
        words.add("trucks");
        words.add("kitten");
        System.out.println(words);
        System.out.println(wordPrint(words));
    }
}
