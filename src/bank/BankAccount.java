package bank;
import java.util.Random;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfAccounts;
	private static double totalBank;
	
	private String accountNumber;
	Random randMachine = new Random();
	public BankAccount() {
		String aNum = generatePassword();
		this.accountNumber = aNum;
		BankAccount.numberOfAccounts++;
	}
	public void printBalance() {
		System.out.println(this.accountNumber);
		System.out.println("Checking Account Balance : $ "+this.checkingBalance);
		System.out.println("Savings Account Balance : $ "+this.savingsBalance);
	}
	// getter for checking account
	public double checkCheckings() {
		return this.checkingBalance;
	}
	//setter for totalBank
	public static void setTotalBank(String type, double amount) {
		totalBank += amount;
		//		if (type.toLowerCase().equals("checking")) {
//			totalBank += amount;	
//		} else if (type.toLowerCase().equals("savings")) {
//			totalBank += amount;
//		}
	}
	// deposit to checking account or savings account
	public void deposit(String type, double amount) {
		if (type.toLowerCase().equals("checking")) {
			this.checkingBalance += amount;
			totalBank += amount;
			System.out.println(" $ "+amount+" has been deposited to checking balance");
		} else if (type.toLowerCase().equals("savings")) {
			this.savingsBalance += amount;
			totalBank += amount;
			System.out.println(" $ "+amount+" has been deposited to savings balance");
		} else {
			System.out.println("Please provide account type: 'checking' or 'savings' and the deposit amount");
		}
	}
	// getter for savings account
	public double checkSavings() {
		return this.savingsBalance;
	}
	// withdraw from checking account or savings account
	public void withdraw(String type, double amount) {
		if (type.toLowerCase().equals("checking")) {
			if(amount <= this.checkingBalance) {
				this.checkingBalance -= amount;
				totalBank -= amount;
				System.out.println(" $ "+amount+" has been withdrawn from the checking balance");
			} else {
				System.out.println("Account Balance too low");
			}

		} else if (type.toLowerCase().equals("savings")) {
			if(amount <= this.savingsBalance) {
				this.savingsBalance -= amount;
				totalBank -= amount;
				System.out.println(" $ "+amount+" has been withdrawn from the savings balance");
			} else {
				System.out.println("Account Balance too low");
			}

		} else {
			System.out.println("Please provide account type: 'checking' or 'savings' and the withdrawal amount");
		}
	}
	public static int accountCount() {
		return numberOfAccounts;
	}
	public static double bankMoney() {
		return totalBank;
	}
	
	private String getRandomNumber() {
        int rand = randMachine.nextInt(10);
        String result = String.valueOf(rand);
        return result;
    }
    // generatePassword use previous method to create a random string of 10 characters
            // return randomly generated string
	private String generatePassword() {
        String result = "";
        for (int i=0; i<10; i++) {
            result += getRandomNumber();
        }
        return result;
    }
	
}
