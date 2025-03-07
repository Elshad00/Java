public final class Woman extends Human {
    public Woman() {}

    public Woman(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Woman(String name, String surname, int dateOfBirth, Family family) {
        super(name, surname, dateOfBirth, family);
    }

    @Override
    public void greetPet(){
        System.out.println("Awww, my baby " + getFamily().getPet().getNickname() + "!");
    }

    public void makeup() {
        System.out.println("I'am doing my makeup");
    }
}
