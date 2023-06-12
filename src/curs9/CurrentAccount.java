package curs9;

public class CurrentAccount implements Account {

	public double balance;
	
	@Override
	public void deposit(double amount) throws InvalidAmountException {
		
		if(amount <= 0) {
			throw new InvalidAmountException(amount + "is not valid");
		}
		
		balance = balance + amount;
		// System.out.println("Current balance is: " + balance);
		checkBalance();
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		
		if(amount > balance) {
			throw new InsufficientFundsException("You don't have sufficient funds!");
		}
		
		balance = balance - amount;
		// System.out.println("Current balance is: " + balance);
		checkBalance();
	}

	@Override
	public void checkBalance() {
	
		System.out.println("Current balance is: " + balance);
		
	}

}
