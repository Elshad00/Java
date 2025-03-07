public enum Species {
    DOMESTIC_CAT("Domestic cat", false, 4, true),
    ROBO_CAT("Robo cat", false, 4, true),
    DOG("Dog", false, 4, true),
    FISH("Fish", false, 0, false),
    UNKNOWN("Unknown", false, 0, false); // Default species for unknown types

    private String type;
    private boolean canFly;
    private int numberOfLegs;
    private boolean hasFur;

    Species(String type, boolean canFly, int numberOfLegs, boolean hasFur) {
        this.type = type;
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public String getType() {
        return type;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean isHasFur() {
        return hasFur;
    }
}