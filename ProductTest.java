// quick test for the product map before the file reading part is ready
public class ProductTest {

    public static void main(String[] args) {
        ProductMap productMap = new ProductMap();

        // same as reading these lines from Sales.txt
        productMap.updateProduct(5020, "blouse", 2);
        productMap.updateProduct(5030, "jeans", 1);
        productMap.updateProduct(5020, "blouse", 3);   // same product again

        productMap.printProducts();
    }
}
