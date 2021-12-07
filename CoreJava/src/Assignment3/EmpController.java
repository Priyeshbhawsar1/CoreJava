package Assignment3;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.InputMismatchException;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Scanner;

public class EmpController {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException,
			InputMismatchException, EOFException, ConcurrentModificationException {

		File fi = new File("D:/JavaAssignment/CoreJava/src/Employees.txt");
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> al = new ArrayList<>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null;
		if (fi.isFile()) {
			ois = new ObjectInputStream(new FileInputStream(fi));
			al = (ArrayList<Employee>) ois.readObject();
			ois.close();
		}
		while (true) {
			System.out.println("Enter Employee Add:1");
			System.out.println("Enter Employee Delete:2");
			System.out.println("Enter Employee search:3");
			System.out.println("Display all the Employees:4");
			System.out.println("Enter your Choice");
			int choise = sc.nextInt();

			switch (choise) {
			case 1:
				System.out.println("Enter Employee detaits");
				System.out.println("Enter id");
				long id = sc.nextLong();
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter Email");
				String email = sc.next();
				System.out.println("Enter Age");
				int age = sc.nextInt();
				System.out.println("Enter DateOfBirth");
				int DateOfBirth = sc.nextInt();
				al.add(new Employee(id, name, email, age, DateOfBirth));
				oos = new ObjectOutputStream(new FileOutputStream(fi));
				oos.writeObject(al);
				oos.close();
				System.out.println("record added");

				break;
			case 2:
				System.out.println("Enter the employee id to delete");
				long id1 = sc.nextLong();
				li = al.listIterator();
				while (li.hasNext()) {
					Employee e = (Employee) li.next();
					if (e.getId() == id1) {
						li.remove();
						oos = new ObjectOutputStream(new FileOutputStream(fi));
						oos.writeObject(al);
						oos.close();
						System.out.println("Delete Successfully");
					} else {
						System.out.println("Employee Does not  Exist");
					}
				}
				break;
			case 3:
				
				boolean found= false;
				System.out.println("Enter serach the employee id");
				long searchid2 = sc.nextLong();
				li = al.listIterator();
				while (li.hasNext()) {
					Employee e = (Employee) li.next();
					if (e.getId() == searchid2) {
						System.out.println(e.toString());
						found=true;
						break;
					}
				}
					if(found)
						System.out.println("record found");
					else {
						System.out.println("record not found");
					}
				
				break;
			case 4:
				// Display all the Employee Records
				li = al.listIterator();
				while (li.hasNext()) {
					System.out.println(li.next());
				}
				break;
			}

		}

	}

}
