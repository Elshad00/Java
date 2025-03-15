import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[11];
        students[0] = new Student(3, "Asif", "Salmanova", 92.5, 2000, "Male");
        students[1] = new Student(5, "Vasif", "Salmanov", 93.5, 1999, "Male");
        students[2] = new Student(11, "Vaqif", "Salmanov", 95, 2000, "Male");
        students[3] = new Student(4, "Ağasif", "Salmanov", 88, 2001, "Male");
        students[4] = new Student(2, "Əli", "Salmanov", 76, 1999, "Male");
        students[5] = new Student(9, "Əli", "Salmanov", 100, 2001, "Male");
        students[6] = new Student(1, "Aydan", "Salmanova", 92, 1999, "Female");
        students[7] = new Student(7, "Aysel", "Salmanova", 100, 2001, "Female");
        students[8] = new Student(10, "Aişə", "Salmanova", 78, 2002, "Female");
        students[9] = new Student(8, "Zəhra", "Salmanova", 84, 2000, "Female");
        students[10] = new Student(6, "Gülnar", "Salmanova", 95, 2001, "Female");

        Comparator<Student> comparator = (student1, student2) -> {
            int gradeCompare = Double.compare(student2.getGrade(), student1.getGrade());
            if (gradeCompare != 0) {
                return gradeCompare;
            }

            int birthDateCompare = Integer.compare(student1.getBirthDate(), student2.getBirthDate());
            if (birthDateCompare != 0) {
                return birthDateCompare;
            }

            return student1.getGender().compareTo(student2.getGender());
        };

        //WITHOUT LAMBDA
//        StudentComparator comparator = new StudentComparator();
//        Arrays.sort(students, comparator);
//        for (Student student : students) {
//            System.out.println(student);
//
//        }

        Arrays.sort(students);
        System.out.println("Sort by ID:");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, comparator);
        System.out.println("\nSorted by Grade (Descending), BirthDate (Ascending), Gender (Females First):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}