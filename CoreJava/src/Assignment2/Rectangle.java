package Assignment2;

import java.util.InputMismatchException;

public class Rectangle {
		
			public double area(double length,double width) {
				
			try 
			{
				return length*width;
			}
			catch(InputMismatchException e) {
				e.printStackTrace();
				return 0.0;
			}
		}
			public double perimeter(double length,double width) {
				
				try 
				{
					return 2*(length + width);	
				}
				catch(InputMismatchException e) {
					e.printStackTrace();
					return 0.0;
				}
			}
			
}