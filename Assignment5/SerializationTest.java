package Assignment5;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationTest {
	public static void main(String args[]) throws IOException {
			Address ad=new Address("Indore","MP",452001,"India");
			Student st=new Student("Raaj","20/11/1998",ad);
			
			Address ad1=new Address("Bhopal","MP",451001,"India");
			Student st1=new Student("Raaja","2/10/1999",ad1);
			
			Address ad2=new Address("Mumbai","MH",402001,"India");
			Student st2=new Student("veer","10/01/1999",ad2);
			
			ArrayList<Student> al=new ArrayList<>();
			al.add(st);
			al.add(st1);
			al.add(st2);
			try {
				FileOutputStream fos=new FileOutputStream("output1.ser",true);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(al);
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Done Writing");
	}
}
