package Assignment3;

import java.io.Serializable;

public class Employee implements Serializable {
	private long id;
	private String Name;
	private String Email;
	private int Age;
	private int DateOfBirth;

	public Employee(long id, String name, String email, int age, int dateOfBirth) {
		super();
		this.id = id;
		this.Name = name;
		this.Email = email;
		this.Age = age;
		this.DateOfBirth = dateOfBirth;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Age=" + Age + ", DateOfBirth="
				+ DateOfBirth + "]";
	}

}
