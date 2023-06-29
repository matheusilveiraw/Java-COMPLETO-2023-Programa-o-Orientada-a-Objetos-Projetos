package entities;

public class Conta {
	private String accHolder;
	private int accNumber;
	private double totalValue;
	
	public void deposito(double value) {
		this.totalValue += value;
	}
	
	public void saque(double value) {
		this.totalValue = this.totalValue - value - 5;
	}
	
	
	public Conta(int accNumber, String accHolder, double totalValue) {
		super();
		this.accHolder = accHolder;
		this.accNumber = accNumber;
		this.totalValue = totalValue;
	}

	//-------------------

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
}
