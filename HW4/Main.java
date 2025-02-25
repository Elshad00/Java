public class Main {
    public static void main(String[] args) {
        Organism organism = new Organism();
        organism.breathe();
        organism.grow();
        System.out.println();

        Prunus prunus = new Prunus();
        prunus.absorb();
        prunus.photosynthesis();
        System.out.println();

        Dodder dodder = new Dodder();
        dodder.absorb();
        dodder.photosynthesis();
        System.out.println();

        Mammal mammal = new Mammal();
        mammal.reproduce();
        mammal.makeSound();
        mammal.move();
        mammal.feedMilk();
        System.out.println();


        Cat cat = new Cat();
        cat.makeSound();
        cat.scratch();
        System.out.println();

        Dog dog = new Dog();
        dog.makeSound();
        dog.fetch();
        System.out.println();

        Horse horse = new Horse();
        horse.makeSound();
        horse.gallop();
        System.out.println();

        Bird bird = new Bird();
        bird.reproduce();
        bird.makeSound();
        bird.move();
        System.out.println();

        Chicken chicken = new Chicken();
        chicken.makeSound();
        chicken.running();
        System.out.println();

        Hawk hawk = new Hawk();
        hawk.makeSound();
        hawk.hunt();
        System.out.println();

        Parrot parrot = new Parrot();
        parrot.makeSound();
        parrot.dance();
        System.out.println();

        Fish fish = new Fish();
        fish.reproduce();
        fish.makeSound();
        fish.move();
        fish.breathe();
        System.out.println();
    }
}
