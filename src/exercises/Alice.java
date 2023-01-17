package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String aliceExert = "Alice was beginning to get very tired of sitting by her sister on the bank, and " +
                "of having nothing to do:  once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the " +
                "use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println(aliceExert);
        String aliceExertAllCaps = aliceExert.toUpperCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Provide a word to search for in the previous sentence: ");
        String term = input.nextLine();
        String termAllCaps = term.toUpperCase();
        System.out.println(aliceExertAllCaps.contains(termAllCaps));

        Integer index = aliceExertAllCaps.indexOf(termAllCaps);
        Integer length = termAllCaps.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = aliceExert.replace(term, "");
        System.out.println(modifiedSentence);
    }
}
