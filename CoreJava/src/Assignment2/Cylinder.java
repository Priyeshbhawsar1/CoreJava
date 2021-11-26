package Assignment2;

import java.util.InputMismatchException;

public class Cylinder {

	public double volume(double radius,double heigth) {
		
		try 
		{
			return Math.PI*radius*radius*heigth;
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			return 0.0;
			
		}
	}
		
		
	}
