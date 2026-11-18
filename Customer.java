public class Customer {
	private int customerId;
	private String fName;
	private String lName;
	private double totalBill;
	
	public Customer(int customerId, String fName, String lName) {
		this.customerId=customerId;
		this.fName=fName;
		this.lName=lName;
		this.totalBill=0.0;
	}
	public void addPurchased(double amount) {
		totalBill += amount;
	}
	public int getCustomerId(){
		return customerId;
	}
	public String getFName() {
		return fName;
	}
	public String getLName() {
		return lName;
	}
	public double getTotalBill() {
		return totalBill;
	}
}
