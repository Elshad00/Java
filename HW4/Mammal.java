public class Mammal extends Animal{
    @Override
    public void reproduce() {
        System.out.println("Mammals reproduces by giving birth.");
    }

    @Override
    public void makeSound() {
        System.out.println("Mammals makes sound.");
    }

    @Override
    public void move() {
        System.out.println("Mammals move with the help of their legs.");
    }

    public void feedMilk() {
        System.out.println("Mammals feeds milk to their youngs.");
    }
}
