import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int gradeCompare = Double.compare(s2.getGrade(), s1.getGrade());
        if (gradeCompare != 0) {
            return gradeCompare;
        }

        int birthDateCompare = Integer.compare(s1.getBirthDate(), s2.getBirthDate());
        if (birthDateCompare != 0) {
            return birthDateCompare;
        }

        return s1.getGender().compareTo(s2.getGender());
    }
}