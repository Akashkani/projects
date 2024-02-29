package javaDB;

public class ATMprojectPOJO {

	private int accNum1;
	private int pin1;
	private int balance1;
	private String name1;
	
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public int getAccNum() {
		return accNum1;
	}
	public void setAccNum(int accNum) {
		this.accNum1 = accNum;
	}
	public int getPin() {
		return pin1;
	}
	public void setPin(int pin) {
		this.pin1 = pin;
	}
	public int getBalance() {
		return balance1;
	}
	public void setBalance(int balance) {
		this.balance1 = balance;
	}
    public ATMprojectPOJO() {
		
	}
	public String toString() {
		return "ATMprojectPOJO [accNum1=" + accNum1 + ", pin1=" + pin1 + ", balance1=" + balance1 + ", name1=" + name1
				+ "]";
	}
	public ATMprojectPOJO(int accNum1, int pin1, int balance1, String name1) {
		super();
		this.accNum1 = accNum1;
		this.pin1 = pin1;
		this.balance1 = balance1;
		this.name1 = name1;
	}
	
	

}
