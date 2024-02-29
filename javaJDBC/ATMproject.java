package javaDB;

import java.util.Scanner;
public class ATMproject {

	public static void main(String[] args) throws Exception {
		
	       
		    System.out.println("Welcome to the ATM Mini Project!");
 
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Account Number : ");
	        int userAcc = scanner.nextInt();
	        
	        System.out.println("Enter Pin Number : ");
	        int userPin = scanner.nextInt();
	        
	        
			
			ATMprojectPOJO ap = ATMprojectDAO.getData(userAcc,userPin);
		    int balance = ap.getBalance();
	        int sysAcc = ap.getAccNum();
	    	int sysPin = ap.getPin();
	    	String name = ap.getName1();
	        
	        if(sysAcc == userAcc & sysPin == userPin) {
	        	
	        	System.out.println("Hi Welcome "+name);
	       
	        while (true) {
	            System.out.println("\n1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
 
	            int choice = scanner.nextInt();
 
	            switch (choice) {
	                case 1:
	                	System.out.println("Your balance: $" + balance);
	                    break;
	                case 2:
	                	 System.out.print("Enter the amount to deposit: $");
	         	        int amount = scanner.nextInt();
 
	         	        if (amount > 0) {
	         	            balance = balance+ amount;
	         	            ATMprojectDAO.updateData(sysAcc, balance);
	         	            System.out.println("Deposit successful. Updated balance: $" + balance);
	         	        } else {
	         	            System.out.println("Invalid amount. Please enter a positive value.");
	         	        }
	                    break;
	                    
	                case 3:
	                	 System.out.print("Enter the amount to withdraw: $");
	                	 int withDrawamount = scanner.nextInt();
 
	         	        if (withDrawamount > 0 && withDrawamount <= balance) {
	         	            balance = balance - withDrawamount;
	         	            ATMprojectDAO.updateData(sysAcc, balance);
	         	            System.out.println("Withdrawal successful. Updated balance: $" + balance);
	         	        } else if (withDrawamount > balance) {
	         	            System.out.println("Insufficient funds. Your balance is not enough for this withdrawal.");
	         	        } else {
	         	            System.out.println("Invalid amount. Please enter a positive value.");
	         	        }
	         	        
	                    break;
	                    
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	    } else {
	    	System.err.println("Entered Account & Pin combo not valid, Pls enter correct Data");
	    }

	}

}
