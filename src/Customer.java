public class Customer {
    private String customerName;
    private Purchase purchase;

    public Customer(String customerName, Purchase purchase) {
        this.customerName = customerName;
        this.purchase = purchase;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        purchase.displayPurchaseDetails();
    }
}
