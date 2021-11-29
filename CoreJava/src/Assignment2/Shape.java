package Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shape {
				
				
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the shape to calculate area and perimeters:");
		System.out.println("Enter circle: 1");
		System.out.println("Enter Sphere: 2");
		System.out.println("Enter Cylinder:3");
		System.out.println("Enter Rectangle: 4");
		System.out.println("Enter Square: 5");
		System.out.println("Enter Triangle: 6");
		
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			
			System.out.println("Enter the radius of the circle");
			try {
			double radius=sc.nextDouble();
			if(radius<0) {
				throw new Exception("radius cant be less than zero");
			}
			
			Circle c=new Circle(); 
			System.out.println("Area of the circle is:" +c.area(radius));
			System.out.println("diameter the circle is:" +c.diameter(radius));
			System.out.println("circumference of the circle is:" +c.circumference(radius));
			}catch(InputMismatchException e) {
				System.out.println("invalid  please enter number 0-9");
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
			break;
			
         case 2:
			
			System.out.println("Enter the radius of Sphere");
			try {
			double radius=sc.nextDouble();
			if(radius<0) {
				throw new Exception("radius cant be a negative Number");
			}
			Sphere s=new Sphere();
			System.out.println("The Volume of Sphere is : " + s.volume(radius));
		    System.out.println("The Surface Area of Sphere is : " + s.surfaceArea(radius));
			}catch(InputMismatchException e) {
				System.out.println("invalid  please enter number 0-9");
			}catch(Exception e) {
				e.printStackTrace();
			}
			break;

		case 3:
			
			try 
			 {
			System.out.println("Enter the radius of cylinder");
			double radius=sc.nextDouble();
			if(radius<0) {
				throw new Exception("radius  cant be a negative Number");
				
			}
			System.out.println("Enter the heigth of cylinder :");
			double heigth= sc.nextDouble();
			
			if(heigth<0) {
				throw new Exception("heigth  cannot be less than zero ");
				
			}
			Cylinder c=new Cylinder();
			System.out.println("Enter the valume of cylinder:"+c.volume(radius,heigth));
			
			}catch(InputMismatchException e) {
				System.out.println("invalid  please enter number 0-9");
			}catch(Exception e) {
				e.printStackTrace();
			}
			break;
		
	
		case 4:
			
			try 
			{
			System.out.println("Enter length of Rectangle:");
			double length=sc.nextDouble();
			if(length<0) {
				throw new Exception("length cant be less than zero ");
			}
			System.out.println("Enter width of Rectangle :");
			double width= sc.nextDouble();
		
			if(width<0) {
				throw new Exception(" width cant be a less than zero");
			}
			Rectangle r=new Rectangle();
			System.out.println("The area of Ractangle is:"+r.area(length,width));
			System.out.println("The perimeter of Ractangle is:"+r.perimeter(length,width));
			}catch(InputMismatchException e) {
				System.out.println("invalid  please enter number 0-9");
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		
		case 5:
			
			try 
			{
			System.out.println("Enter the area of square:");
			double side=sc.nextDouble();
			if(side<0) {
				throw new Exception("are cant be a negative Number");
			}
			System.out.println("Enter the area of perimeter :");
			double perimeter= sc.nextDouble();
			if(perimeter<0) {
				throw new Exception("perimeter cant be a negative Number");
			}
			Square s=new Square();
			System.out.println("The area of Ractangle is:"+s.area(side));
			System.out.println("The perimeter of Ractangle is:"+s.perimeter(side));
			}catch(InputMismatchException e) {
				System.out.println("invalid  please enter number 0-9");
			}catch(Exception e) {
				e.printStackTrace();
			}
			break;
	
		case 6:
			
			try 
			{
			System.out.println("Enter the base of Triangle:");
			double base=sc.nextDouble();
			if(base<0) {
				throw new Exception("base cant be a negative Number");
			}
			System.out.println("Enter the heigth of Triangle :");
			double heigth= sc.nextDouble();
			System.out.print("Enter length of first side of triangle:");
	        double a = sc.nextDouble();
	        System.out.print("Enter length of second side of triangle:");
	        double b = sc.nextDouble();
	        System.out.print("Enter length of third side of triangle:");
	        double c = sc.nextDouble();
	       double perimeter = a + b + c;
			if(perimeter<0) {
				throw new Exception("length cant be a negative Number");
			}
			Triangle t=new Triangle();
			System.out.println("The area of Ractangle is:"+t.area(base,heigth));
			
			System.out.println("The perimeter of Ractangle is:"+t.perimeter(a,b,c));
			}catch(InputMismatchException e) {
				System.out.println("invalid  please enter number 0-9");
			}catch(Exception e) {
				e.printStackTrace();
			}
			break;
			
		case 7:
			System.out.println("Enter the number given range");
		
	
	}
	sc.close();
	}
}
