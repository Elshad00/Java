public class Warranty {
    private int warrantyPeriod;
    private String warrantyProvider;

    public Warranty(int warrantyPeriod, String warrantyProvider) {
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyProvider = warrantyProvider;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public String getWarrantyProvider() {
        return warrantyProvider;
    }

    public void displayWarrantyDetails() {
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
        System.out.println("Warranty Provider: " + warrantyProvider);
    }
}
