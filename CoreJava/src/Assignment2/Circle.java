package Assignment2;

import java.util.InputMismatchException;

public class Circle{
	   
		public double area(double radius) {
			
			try
			{
			      return Math.PI*radius*radius;     
			}
			catch(InputMismatchException e) 
			{
			    	e.printStackTrace();
			    	return 0.0;
			}
		}  
		public double diameter(double radius) {
			
			try
			 {
					return 2*radius;
			 }
			catch(InputMismatchException e) 
			{
					e.printStackTrace();
					return 0.0;
			}
		}
		public double circumference(double radius) {
			
			try
			 {
			       return 2*Math.PI*radius;
			 }
		    catch(InputMismatchException e) 
			{
		    	e.printStackTrace();
		    	return 0.0;
		    }
	   }
}

		
			