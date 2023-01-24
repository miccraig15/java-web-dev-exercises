package chapterfive.exercises;

import chapterfour.exercises.Student;

import java.util.ArrayList;
import java.util.Objects;

//THIS FILE ADDED TO CHAPTER 5 EXERCISES DUE TO SECTION 5.5.3 WHICH INSTRUCTED TO ADD CUSTOM equals() AND toString() METHODS TO THE COURSE CLASS

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        chapterfour.exercises.Student michael = new chapterfour.exercises.Student("Michael", 12345, 1, 4.0);
        chapterfour.exercises.Student steve = new chapterfour.exercises.Student("Steve", 54321, 1, 3.0);
        System.out.println(michael.getName());
        System.out.println(michael.getStudentId());
        System.out.println(michael.getNumberOfCredits());
        System.out.println(michael.getGpa() + "\n");

        class Teacher {
            private String firstName;
            private String lastName;
            private String subject;
            private int yearsTeaching;

            public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.subject = subject;
                this.yearsTeaching = yearsTeaching;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public String getSubject() {
                return subject;
            }

            public int getYearsTeaching() {
                return yearsTeaching;
            }
        }

        Teacher scott = new Teacher("Scott", "Wellington", "History", 7);

        System.out.println(scott.getFirstName());
        System.out.println(scott.getLastName());
        System.out.println(scott.getSubject());
        System.out.println(scott.getYearsTeaching() + "\n");

        class Course {
            private String topic;
            private Teacher instructor;
            private ArrayList<chapterfour.exercises.Student> enrolledStudents;

            public Course(String topic, Teacher instructor, ArrayList<chapterfour.exercises.Student> enrolledStudents) {
                this.topic = topic;
                this.instructor = instructor;
                this.enrolledStudents = enrolledStudents;
            }

            public String getTopic() {
                return topic;
            }

            public Teacher getInstructor() {
                return instructor;
            }

            public ArrayList<chapterfour.exercises.Student> getEnrolledStudents() {
                return enrolledStudents;
            }

            public String toString() {
                return topic + " is a Course taught by Professor " + getInstructor().getLastName() + " with " + getEnrolledStudents().toArray().length + " students.";
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Course course = (Course) o;
                return topic.equals(course.topic) && instructor.equals(course.instructor) && enrolledStudents.equals(course.enrolledStudents);
            }

            @Override
            public int hashCode() {
                return Objects.hash(topic, instructor, enrolledStudents);
            }
        }
        ArrayList<Student> enrolledStudents = new ArrayList<>();
        enrolledStudents.add(michael);
        enrolledStudents.add(steve);
        Course introToHistory = new Course("Intro to History", scott, enrolledStudents);

        System.out.println(introToHistory.getTopic());
        System.out.println(introToHistory.getInstructor().getLastName());
        System.out.println(introToHistory.getEnrolledStudents().get(0).getName() + ", " + introToHistory.getEnrolledStudents().get(1).getName());
        System.out.println(introToHistory.toString());
    }
}