package chapterfive.exercises;

public class MainPractice {
    public static void main(String[] args) {
        Student michael = new Student("Michael", 12345, 93, 3.79);
        Student steve = new Student ("Steve", 54321, 52, 3.26);
        System.out.println(michael.toString());
        System.out.println(steve.toString());
        System.out.println(michael.equals(steve));
    }
}