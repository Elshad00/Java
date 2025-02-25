public class Fish extends Animal{
    @Override
    public void reproduce() {
        System.out.println("Fish reproduce by laying caviarş");
    }

    @Override
    public void makeSound() {
        System.out.println("Fish make bubbles.");
    }

    @Override
    public void move() {
        System.out.println("Fish move by swimming.");
    }

    @Override
    public void breathe() {
        System.out.println("Fish breathe with the help of gills");
    }
}
