package Assignment4;

class ThreadSafe implements Runnable {
	Account ac = new Account(1000.0);

	public void run() {
		ac.safeWithdrow(1000);
		if (ac.balance < 0) {
			System.out.println("Accaunt empty");

		}

	}

}

class ThreadUnSafe implements Runnable {
	Account ac = new Account(1000.0);

	public void run() {
		ac.unsafeWithdrow(1000);
		if (ac.balance < 0) {
			System.out.println("Accaunt empty");

		}

	}

}
