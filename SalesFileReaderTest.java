public class SalesFileReaderTest {

    public static void main(String[] args) {

        ProductMap productMap = new ProductMap();

        SalesFileReader.readSalesFile("Sales.txt", productMap);

        productMap.printProducts();
    }
}

