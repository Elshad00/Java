public final class Man extends Human {
    public Man() {}

    public Man(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Man(String name, String surname, int dateOfBirth, Family family) {
        super(name, surname, dateOfBirth, family);
    }

    @Override
    public void greetPet(){
        System.out.println("Hey " + getFamily().getPet().getNickname() + "!");
    }

    public void repairCar() {
        System.out.println("I'm repairing the car.");
    }
}
