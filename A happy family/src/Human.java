public class Human {
    String name;
    String surname;
    int dateOfBirth;
    int IQ;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    Human() {}

    Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mother = mother;
        this.father = father;
    }

    Human(String name, String surname, int dateOfBirth, int IQ, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.IQ = IQ;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public String toString(){
        return "Human{name='" + this.name + "', surname='" + this.surname + "', year=" + this.dateOfBirth + ", iq=" + this.IQ + ", mother=" +
                this.mother + ", father=" + this.father + ", pet=" + (pet != null ? pet.toString() : "X") + "}";
    }

    void greetPet(){
        System.out.println("Hello, " + pet.nickname);
    }

    void describePet(){
        if(pet.age >= 50) {
            System.out.printf("I have a(n) %s is %d years old, he is very sly\n", this.pet.species, this.pet.age);
        } else {
            System.out.printf("I have a(n) %s is %d years old, he is almost not sly\n", this.pet.species, this.pet.age);
        }
    }
}
