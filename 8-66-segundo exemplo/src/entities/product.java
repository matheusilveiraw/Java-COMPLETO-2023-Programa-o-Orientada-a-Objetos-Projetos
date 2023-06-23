package entities;

public class product {
	public String name;
	public double price;
	public int quantity; 
	
	public double totalValueInStock() {
		return price * quantity; 
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() { //sobrescrevendo o toString
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, total: $" + String.format("%.2f", totalValueInStock());
	}
	
}
