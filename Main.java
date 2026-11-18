

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer_Map customerMap = new Customer_Map();
		ProductMap productMap = new ProductMap();
		
		//Loading customer information in customerMap
		customerMap.updateCustomer(1, "John", "Smith", 27.50);
		customerMap.updateCustomer(2, "Mary", "Jones", 45.00);
		customerMap.updateCustomer(3, "Johnathan", "Major", 55.50);
		customerMap.updateCustomer(4, "Micheal", "Muuki", 499.99);

		customerMap.printCustomers();
		
		
		//Loading product information to productMap
		productMap.updateProduct(101, "Milk", 5);
		productMap.updateProduct(102, "Chicken", 3);
		productMap.updateProduct(103, "Cushioned Chair", 2);
		productMap.updateProduct(1004, "55inch Flatscreen TV",1);

		productMap.printProducts();
		
		
		//Result of matching up each product to a customer
		
	}

}
