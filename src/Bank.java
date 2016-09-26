import java.util.ArrayList;

public class Bank {
	ArrayList<Account> accounts = new ArrayList<Account>();

	void addAccount(Account a) throws PreviouslyExistingAccountException {
		boolean existing = false;
		for (Account q : accounts) {
			if (a.getAccountNumber() == q.getAccountNumber()) {
				existing = true;
				break;
			}
		}
		if (!existing) {
			accounts.add(a);
		} else {
			throw new PreviouslyExistingAccountException("Another account currently has your requested account ID.");
		}
	}

	void removeAccount(int place) {
		accounts.remove(place);
	}

	void addMoney(int accountNumber, float amount) throws NonExistentAccountException {
		boolean there = false;
		for (Account a : accounts) {
			if (a.getAccountNumber() == accountNumber) {
				a.addMoney(amount);
				there = true;
				break;
			}
		}
		if (!there) {
			throw new NonExistentAccountException("No account exists with an Account ID of " + accountNumber + "!");
		}
	}

	void withdrawMoney(int accountNumber, float amount) throws NonExistentAccountException {
		boolean there = false;
		for (Account a : accounts) {
			if (a.getAccountNumber() == accountNumber) {
				there = true;
				try {
					a.withdrawMoney(amount);
				} catch (AccountOverdrawnException e) {
					// NOTHING HERE
				}
				break;
			}
		}
		if (!there) {
			throw new NonExistentAccountException("No account exists with an Account ID of " + accountNumber + "!");
		}
	}
}
