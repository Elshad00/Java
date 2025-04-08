public abstract class Human {
    private int id;
    private String name;
    private String surname;
    private String gender;
    private String email;
    private int birthDate;

    public Human(int id, String name, String surname, String gender, String email, int birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.email = email;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public int getBirthDate() {
        return birthDate;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}