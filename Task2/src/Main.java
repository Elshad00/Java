public class Main {
    public static void main(String[] args) {
        // Creating a seller
        Seller seller1 = new Seller("TechStore");

        // Creating a computer object
        Computer comp1 = new Computer(32, 1024, 12, "NVIDIA RTX 3050");

        // Creating a warranty object
        Warranty warranty1 = new Warranty(2, "Techbar");

        // Creating a purchase object
        Purchase purchase1 = new Purchase("2025-01-31", 1799.99, seller1, comp1, warranty1);

        // Creating a customer with the purchase
        Customer customer1 = new Customer("Elshad", purchase1);

        // Display customer and purchase details
        customer1.displayCustomerInfo();
    }
}
