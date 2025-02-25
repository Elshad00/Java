public class Bird extends Animal{
    @Override
    public void reproduce() {
        System.out.println("Birds reproduce by laying eggs.");
    }

    @Override
    public void makeSound() {
        System.out.println("Birds make sound");
    }

    @Override
    public void move() {
        System.out.println("Birds move with their legs but mainly by flying.");
    }
}
