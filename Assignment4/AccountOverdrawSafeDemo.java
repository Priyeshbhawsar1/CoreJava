package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountOverdrawSafeDemo {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			ThreadSafe ts = new ThreadSafe();
			Thread t1 = new Thread(ts, "raaj");
			Thread t2 = new Thread(ts, "veer");

			ThreadUnSafe tus = new ThreadUnSafe();
			Thread t3 = new Thread(tus, "raaj");
			Thread t4 = new Thread(tus, "veer");

			System.out.println("Thread safe : 1");
			System.out.println("Thread Unsafe : 2");
			System.out.println("Enter choice");

			try {
				int choice = sc.nextInt();
				switch (choice) {

				case 1:
					t1.start();
					t2.start();
					break;
				case 2:
					t3.start();
					t4.start();
					break;
				}
				Thread.sleep(5000);
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}

		}
	}
}
