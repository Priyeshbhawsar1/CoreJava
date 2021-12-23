package Assignment5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializationTest {
	public static void main(String args[]) throws ClassNotFoundException {
		try {
			FileInputStream fos = new FileInputStream("output1.ser");
			ObjectInputStream ois = new ObjectInputStream(fos);
			ArrayList<Student> al = (ArrayList<Student>) ois.readObject();
			// ois.readObject();
			if (al != null) {
				for (Student st : al) {
					System.out.println(st);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
