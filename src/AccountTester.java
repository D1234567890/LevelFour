
public class AccountTester {
	public static void main(String[] args) {
		Bank bank = new Bank();
		try {
			bank.addAccount(new Account(7));
		} catch (PreviouslyExistingAccountException e) {
			// NOTHING HERE
		}
		try {
			bank.addAccount(new Account(9));
		} catch (PreviouslyExistingAccountException e) {
			// NOTHING HERE
		}
		try {
			bank.addAccount(new Account(9));
		} catch (PreviouslyExistingAccountException e) {
			// NOTHING HERE
		}
		try {
			bank.addMoney(7, 14.2f);
		} catch (NonExistentAccountException e) {
			// NOTHING HERE
		}
		try {
			bank.withdrawMoney(7, 52.9f);
		} catch (NonExistentAccountException e) {
			// NOTHING HERE
		}
		try {
			bank.addMoney(17, 49.1f);
		} catch (NonExistentAccountException e) {
			// NOTHINF HERE
		}
	}
}
