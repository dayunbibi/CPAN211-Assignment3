import java.util.*;

// keeps all products in a map using ProductID as the key
public class ProductMap {

    private Map<Integer, Product> products = new LinkedHashMap<>();

    // insert a new product or update an existing one
    public void updateProduct(int productId, String productName, int items) {
        if (!products.containsKey(productId)) {
            // first time we see this product, so add it to the map
            products.put(productId, new Product(productId, productName));
        }
        // add the items to this product's total count
        products.get(productId).addPurchased(items);
    }

    // print all products with their total count of purchased items
    public void printProducts() {
        System.out.println("===== Products Report =====");
        System.out.printf("%-10s %-15s %s%n", "ID", "Product", "Items Sold");
        for (int id : products.keySet()) {
            Product p = products.get(id);
            System.out.printf("%-10d %-15s %d%n", p.getProductId(), p.getProductName(), p.getTotalPurchased());
        }
    }
}
