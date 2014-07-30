/**
 * bank.java
 * demonstrates basic OOP syntax
 * to run this program
 **/

class BankAccount{

	private double balance;		// account balance

	public BankAccount( double openingBalance ){
		balance = openingBalance;
	}

	public void deposit ( double amount ) {
		balance = balance + amount;
	}

	public void withdraw ( double amount ){
		balance = balance - amount;		
	}

	public void display(){
		System.out.println( "balance=" + balance );
	}

} //end class BankAccount

class BankApp{

	public static void main( String[] args ){

		BankAccount firstBankAccount = new BankAccount(100); // create account

		System.out.print("Before transactions, ");
		firstBankAccount.display();	//display balance
	
		firstBankAccount.deposit( 43.35 ); // make deposit
		firstBankAccount.withdraw( 20.00 ); //make withdrawal

		System.out.print("After transactions, "); // display balance
		firstBankAccount.display();
	} // end main()

} // end class BankApp
