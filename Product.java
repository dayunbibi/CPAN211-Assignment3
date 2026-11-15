// stores the details of one product
public class Product {

    private int productId;
    private String productName;
    private int totalPurchased;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
        this.totalPurchased = 0;
    }

    // add the number of items bought to the total count
    public void addPurchased(int items) {
        totalPurchased += items;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getTotalPurchased() {
        return totalPurchased;
    }
}
