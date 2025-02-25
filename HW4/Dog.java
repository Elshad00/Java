public class Dog extends Mammal{
    @Override
    public void makeSound() {
        System.out.println("The dog is barking.");
    }

    public void fetch() {
        System.out.println("The dog is fetching the ball.");
    }
}
