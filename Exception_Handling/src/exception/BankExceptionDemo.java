package exception;

import java.util.HashMap;
import java.util.Map;

/*
Create multiple classes to imitate a bank structure with proper Exception Handling.
For eg., if the user tries to withdraw more than the balance, throw "InsufficientBalanceException" (created customly)
 */
class AccountDoesNotExistException extends Exception {
	public AccountDoesNotExistException(String message) {
		super(message);
	}
}

class InsufficientAmountException extends Exception {

	public InsufficientAmountException(String message) {
		super(message);
	}
}

class Account {

	private String accountNumber;
	private double amount;

	public Account(String accountNumber, double amount) {
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public void deposit(double amount) throws InsufficientAmountException {
		if (amount <= 99) {
			throw new InsufficientAmountException("The minimal deposit amount is 100!");
		} else {
			this.amount += amount;
		}
		System.out.println("The current balance is:" + this.amount);
	}

	public void withdraw(double amount) throws InsufficientAmountException {
		if (amount > this.amount) {
			throw new InsufficientAmountException("You dont have enough money to withdraw!");
		} else {
			this.amount -= amount;
		}
		System.out.println("The current balance is:" + this.amount);
	}

	public double getBalance() {
		return this.amount;
	}

}

class Bank {
	Map<String, Account> accounts;
	public Bank() {
		accounts = new HashMap<>();
	}

	public void addAccount(Account account, String name) {
		this.accounts.put(name, account);
	}

	public Account getAccount(String name) throws AccountDoesNotExistException {
		if (!accounts.containsKey(name)) {
			throw new AccountDoesNotExistException("The account with name '" + name+"' is not present!");
		}
		return accounts.get(name);
	}
}

public class BankExceptionDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Account account = new Account("123456789",500);
		bank.addAccount(account, "alameen");
		try {
			account = bank.getAccount("alameen");
			account.deposit(1000);
			account.withdraw(200);
			account.withdraw(1000);
			account.withdraw(2000);
			
		}catch(AccountDoesNotExistException e) {
			e.printStackTrace();
		}
		catch(InsufficientAmountException e) {
			e.printStackTrace();
		}
		try {
			account = bank.getAccount("this user");
		}catch(AccountDoesNotExistException e) {
			e.printStackTrace();
		}
	}
}
