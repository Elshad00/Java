public class Purchase {
    private String date;
    private double price;
    private Seller seller;
    private Computer computer;
    private Warranty warranty;

    public Purchase(String date, double price, Seller seller, Computer computer, Warranty warranty) {
        this.date = date;
        this.price = price;
        this.seller = seller;
        this.computer = computer;
        this.warranty = warranty;
    }

    public String getDate() { return date; }
    public double getPrice() { return price; }

    public void displayPurchaseDetails() {
        System.out.println("Purchase Details:");
        System.out.println("Date: " + date);
        System.out.println("Price: $" + price);
        System.out.println("Seller: " + seller.getSellerName());
        computer.displaySpecs();
        warranty.displayWarrantyDetails();
    }
}
