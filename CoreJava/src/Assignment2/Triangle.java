package Assignment2;

import java.util.InputMismatchException;


public class Triangle {

	public double area(double base,double heigth) {
	
		try
		{
			return (base*heigth)/2;
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			return 0.0;		
	}
}
	public double perimeter(double a,double b,double c) {
		
		try
		{
			return a+b+c;
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			return 0.0;	
		}
	}
		
}