package Assignment2;

import java.util.InputMismatchException;


public class Sphere {
    public double volume(double radius) {
    	
    		try
    		{
    			return (4*Math.PI*radius*radius*radius)/3;
    		}
    		catch(InputMismatchException e) {
    			e.printStackTrace();
    			return 0.0;	
    		}
    			
    	}
    public double surfaceArea(double radius) {		
    	
    	try
    	{
    		return 4*Math.PI*radius*radius;
    	}
    	catch(InputMismatchException e) {
			e.printStackTrace();
			return 0.0;
		}
    }
    
}

    	
			