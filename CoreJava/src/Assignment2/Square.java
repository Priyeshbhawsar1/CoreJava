package Assignment2;

import java.util.InputMismatchException;


public class Square {
         public double area(double side) {     
        	
		try
		{
			return side*side;
			
		}catch(InputMismatchException e) {
			e.printStackTrace();
			return 0.0;
			
         }
    }
         public double perimeter(double side) {
        	 
        	 try 
        	 {
        		 return  4*side;
        	 }
        	 catch(InputMismatchException e) {
        		 e.printStackTrace();
        		 return 0.0;
         }
        }
         
}
