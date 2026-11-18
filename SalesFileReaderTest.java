public class SalesFileReaderTest {

    public static void main(String[] args) {

        ProductMap productMap = new ProductMap();

        Customer_Map customerMap = new Customer_Map();

        SalesFileReader.readSalesFile("Sales.txt", productMap, customerMap);

        productMap.printProducts();
        customerMap.printCustomers();
    }
}

