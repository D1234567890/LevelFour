
public class Account {
	private float balance;
	private int accountNumber;
	
	Account(int accountNumber) {
		balance = 0;
		this.accountNumber = accountNumber;
	}
	
	float getBalance() {
		return balance;
	}
	
	void addMoney(float num) {
		balance += num;
	}
	
	void withdrawMoney(float num) throws AccountOverdrawnException {
		float copy = balance;
		float copy1 = num;
		float difference = copy - copy1;
		if (difference < 0) {
			throw new AccountOverdrawnException("You do not have this much money in your bank account!");
		} else {
			balance -= num;
		}
	}
	
	int getAccountNumber() {
		return accountNumber;
	}
}
