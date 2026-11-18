// reads Sales.txt, updates both maps, and prints the two reports
public class Main {

	public static void main(String[] args) {
		Customer_Map customerMap = new Customer_Map();
		ProductMap productMap = new ProductMap();

		// read every record from the file and update both maps
		SalesFileReader.readSalesFile("Sales.txt", productMap, customerMap);

		// print all customers with their final bills, then all products
		customerMap.printCustomers();
		System.out.println();
		productMap.printProducts();
	}
}
