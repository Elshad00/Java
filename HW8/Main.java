import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "John", "Marston", "Male", "john.marston@rdr.uni.edu", 1975, 15, "Computer Science");
        Teacher teacher2 = new Teacher(2, "Arthur", "Morgan", "Male", "arthur.morgan@rdr.uni.edu", 1980, 10, "Mathematics");

        Course cs101 = new Course(101, "Introduction to Programming", "CS-101", 5, "Mon/Wed 10:00", teacher1);
        Course cs102 = new Course(102, "Object-Oriented Programming", "CS-102", 5, "Tue/Thu 11:00", teacher1);
        Course math201 = new Course(201, "Calculus II", "MATH-201", 4, "Tue/Thu 13:00", teacher2);
        Course math202 = new Course(202, "Probability and Statistics", "MATH-202", 4, "Wed/Thu 15:00", teacher2);

        teacher1.teach(cs102);
        teacher1.teach(cs101);
        teacher2.teach(math201);
        teacher2.teach(math202);

        Student student1 = new Student(1001, "Emily", "Johnson", "Female", "emily.johnson@university.edu", 2001);
        Student student2 = new Student(1002, "Michael", "Chen", "Male", "michael.chen@university.edu", 2000);
        Student student3 = new Student(1003, "Sophia", "Martinez", "Female", "sophia.m@university.edu", 2002);
        Student student4 = new Student(1004, "James", "Wilson", "Male", "james.wilson@university.edu", 1999);
        Student student5 = new Student(1005, "Olivia", "Brown", "Female", "olivia.brown@university.edu", 2001);


        student1.addCourse(cs101);
        student1.addCourse(math201);
        student2.addCourse(math201);
        student3.addCourse(cs102);
        student3.addCourse(math202);
        student4.addCourse(cs101);
        student4.addCourse(math202);
        student5.addCourse(cs101);
        student5.addCourse(cs102);

        Exam exam1 = new Exam(1, cs101, student1, "2023-10-15", 85);
        Exam exam2 = new Exam(2, math201, student1, "2023-11-20", 90);
        Exam exam3 = new Exam(3, cs101, student2, "2023-10-15", 78);

        List<Student> students = List.of(student1, student2, student3, student4, student5);
        List<Teacher> teachers = List.of(teacher1, teacher2);
        List<Course> courses = List.of(cs101, cs102, math201, math202);
        List<Exam> exams = List.of(exam1, exam2, exam3);

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.findAndRegisterModules();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(new File("students.json"), students);
            mapper.writeValue(new File("teachers.json"), teachers);
            mapper.writeValue(new File("courses.json"), courses);
            mapper.writeValue(new File("exams.json"), exams);

            System.out.println("Data successfully saved to JSON files!");

            System.out.println("\nSample Student Data:");
            System.out.println(student1);

            System.out.println("\nSample Teacher Data:");
            System.out.println(teacher1);

            System.out.println("\nSample Course Data:");
            System.out.println(cs101);

            System.out.println("\nSample Exam Data:");
            System.out.println(exam1);

        } catch (IOException e) {
            System.err.println("Error saving to JSON: " + e.getMessage());
        }
    }
}
