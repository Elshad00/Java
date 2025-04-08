public class Teacher extends Human implements Teachable {
    private int yearsOfExperience;
    private String specialization;
    private Course course;
    public Teacher(int id, String name, String surname, String gender, String email, int birthDate, int yearsOfExperience, String specialization) {
        super(id, name, surname, gender, email, birthDate);
        this.yearsOfExperience = yearsOfExperience;
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public String getSpecialization() {
        return specialization;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "ID: %d, name: %s, surname: %s, gender: %s, email: %s, date of birth: %d, years of experience: %d , specialization: %s".formatted(
                getId(),
                getName(),
                getSurname(),
                getGender(),
                getEmail(),
                getBirthDate(),
                yearsOfExperience,
                specialization,
                course != null ? course.getCourseName() : "None");
    }

    @Override
    public void teach(Course course) {
        this.course = course;
    }
}