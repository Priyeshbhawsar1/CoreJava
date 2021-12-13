package Assignment5;

import java.io.Serializable;

public class Address implements Serializable{
	private String city;
	private String State;
	private int pinCode;
	private String country;

	public Address() {

	}

	public Address(String city, String state, int pinCode, String country) {
		super();
		this.city = city;
		State = state;
		this.pinCode = pinCode;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;

	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", pinCode=" + pinCode + ", country=" + country + "]";
	}

}