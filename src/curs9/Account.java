package curs9;

public interface Account {

	public void deposit(double amount) throws InvalidAmountException;
	public void withdraw(double amount) throws InsufficientFundsException;
	public void checkBalance();
	
	
}
