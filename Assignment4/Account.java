package Assignment4;

public class Account extends Thread {
	private String name;
	double balance;

	Account(double balance) {
		this.balance = balance;

	}

	public double getBalance() {
		return balance;
	}

	synchronized void safeWithdrow(double withdrowAmount) {
		if (withdrowAmount <= getBalance()) {

			System.out.println("before balance" + Thread.currentThread().getName() + " withdrow " + getBalance());
			balance = getBalance() - withdrowAmount;
			System.out.println(Thread.currentThread().getName() + " has withdrow " + withdrowAmount
					+ " Remaining Balance " + getBalance());

		} else {
			System.out.println("balance empty " + Thread.currentThread().getName());
		}
	}

	synchronized void unsafeWithdrow(double withdrowAmount) {
		if (withdrowAmount <= getBalance()) {

			System.out.println("before balance" + Thread.currentThread().getName() + " withdrow " + getBalance());
			balance = getBalance() - withdrowAmount;
			System.out.println(Thread.currentThread().getName() + " has withdrow " + withdrowAmount
					+ " Remaining Balance " + getBalance());

		} else {
			System.out.println("balance empty " + Thread.currentThread().getName());
		}

	}
}
