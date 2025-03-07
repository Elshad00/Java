public class Main {
    public static void main(String[] args) {
        String[] habits = {"sleeping", "eating", "running"};
        Pet dog = new Dog("Miragha", 3, 80, habits);

        String[][] activities = {{DayOfWeek.SATURDAY.getName(),DayOfWeek.SUNDAY.getName()},{"Exercise","Drawing"}};

        Human mother = new Woman("Farida", "Abdurrahmanov", 1965);
        mother.setSchedule(activities);
        Human father = new Man("Alakbar", "Abdurrahmanov", 1960);
        Family family = new Family(mother, father);
        family.setPet(dog);

        Human child1 = new Human("Israfil", "Abdurrahmanov", 1994);
        Human child2 = new Human("Elekber", "Yasamalli", 2005);


        System.out.println(family);
        System.out.println("The number of family members: " + family.countFamily());
        System.out.println();

        family.addChild(child1);
        System.out.println(family);
        System.out.println("The number of family members: " + family.countFamily());
        System.out.println();

        family.addChild(child2);
        System.out.println(family);
        System.out.println("The number of family members: " + family.countFamily());
        System.out.println();

        family.deleteChild(child1);
        for (int i = 0; i < 10000000; i++) {
            if (family.deleteChild(child1)) {
                System.gc();
            }
        }
        System.out.println(family);
        System.out.println("The number of family members: " + family.countFamily());
        System.out.println();

        family.deleteChildrenWithIndex(0);
        for (int i = 0; i < 10000000; i++) {
            if (family.deleteChild(child1)) {
                System.gc();
            }
        }
        System.out.println(family);
        System.out.println("The number of family members: " + family.countFamily());
        System.out.println();

        mother.describePet();
        ((Woman) mother).makeup();
        father.describePet();
        ((Man) father).repairCar();
        System.out.println();
        ((Dog) dog).foul();
        ((Dog) dog).respond();
    }
}
