import java.util.Random;
import java.util.Scanner;

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

    public boolean feedPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Isn't it time for feeding: ");
        boolean feed = scanner.nextBoolean();
        if(feed) {
            System.out.println("Hm... I will feed Jack");
            scanner.close();
            return true;
        }
        else {
            Random random = new Random();
            int rand = random.nextInt(0, 101);
            if(pet.trickLevel > rand) {
                System.out.println("Hm... I will feed Jack");
                scanner.close();
                return true;
            }
            else {
                System.out.println("I think Jack is not hungry");
                scanner.close();
                return false;
            }
        }

    }

    public String toString(){
        return "Human{name='" + this.name + "', surname='" + this.surname + "', year=" + this.dateOfBirth + ", iq=" + this.IQ + ", mother=" +
                this.mother + ", father=" + this.father + ", pet=" + (pet != null ? pet.toString() : "X") + "}";
    }

    void greetPet(){
        System.out.println("Hello, " + pet.nickname);
    }

    void describePet(){
        if(pet.trickLevel >= 50) {
            System.out.printf("I have a(n) %s is %d years old, he is very sly\n", this.pet.species, this.pet.age);
        } else {
            System.out.printf("I have a(n) %s is %d years old, he is almost not sly\n", this.pet.species, this.pet.age);
        }
    }
}
