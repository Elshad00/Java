import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        int gradeCompare = Double.compare(student2.getGrade(), student1.getGrade());
        if (gradeCompare != 0) {
            return gradeCompare;
        }

        int birthDateCompare = Integer.compare(student1.getBirthDate(), student2.getBirthDate());
        if (birthDateCompare != 0) {
            return birthDateCompare;
        }

        return student1.getGender().compareTo(student2.getGender());
    }
}
