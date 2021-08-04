package bank;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ant = new BankAccount();
		BankAccount tom = new BankAccount();
		
//		ant.printBalance();
//		tom.printBalance();
//		
//		System.out.println(BankAccount.accountCount());
		
		// ant deposit and withdrawl
		ant.deposit("checking", 20000.0);
		ant.deposit("savings", 10000);
		ant.printBalance();
		ant.withdraw("savings", 12000);
		
		// tom deposit and withdrawl
		tom.deposit("checking", 15889);
		tom.deposit("savings", 50000);
		tom.printBalance();
		tom.withdraw("checking", 15000);
		

		
		System.out.println(BankAccount.bankMoney());
		
		
		ant.printBalance();
		tom.printBalance();

	}

}
