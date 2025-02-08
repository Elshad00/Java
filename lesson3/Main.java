public class Main {
    public static void main(String[] args) {
        String[] habits = {"sleeping", "eating", "running"};
        Pet pet = new Pet("Cat", "Miragha", 3, 80, habits);

        Human mother = new Human("Farida", "Abdurrahmanov", 1965);
        Human father = new Human("Alakbar", "Abdurrahmanov", 1960);

        String[][] activities = {{"6","7"},{"Exercise","Drawing"}};
        Human child = new Human("Israfil", "Abdurrahmanov", 1994, 100, pet, mother, father, activities);

        System.out.println(child);
        child.greetPet();
        child.describePet();

        pet.eat();
        pet.respond();
        pet.foul();

        child.feedPet();
    }
}
