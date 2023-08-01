package it.tnsif.daysix;

public class Customer extends Person {
	
	private String custID;
	private String custCity;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String custID, String custCity) {
		super("Abhishek",21,8879451425l);
		this.custID = custID;
		this.custCity = custCity;
	}
	public String getCustID() {
		return custID;
	}
	public void setCustID(String custID) {
		this.custID = custID;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custCity=" + custCity + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
