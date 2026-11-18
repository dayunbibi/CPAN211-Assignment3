import java.util.LinkedHashMap;
import java.util.Map;

public class Customer_Map {
    private Map<Integer, Customer> customer = new LinkedHashMap<>();
    
    public void updateCustomer(int customerId, String fName, String lName, double purchaseAmount) {
    	if(!customer.containsKey(customerId)) {
    		customer.put(customerId, new Customer(customerId, fName, lName));
    	}
    	customer.get(customerId).addPurchased(purchaseAmount);
    }
    public void printCustomers() {
    	System.out.println("=====Customer Report =====");
        System.out.printf("%-10s %-15s %-15s %s%n", "ID", "First Name", "Last Name", "Total Bill");
        for (Customer l : customer.values()) {
        	System.out.printf("%-10d %-15s %-15s $%.2f%n", l.getCustomerId(), l.getFName(), l.getLName(), l.getTotalBill());
        }

    }
}
