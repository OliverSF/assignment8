/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.*;

public class AnimalTester {

	public static void main(String[] args) {
		//creating new Cat & Dog objects
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		//setting names
		dog1.setName("Hank");
		dog2.setName("Bob");
		cat1.setName("Puss");
		cat2.setName("Boots");
		
		//creating Array of type Animal
		Animal array1[] = new Animal[4];
		
		
		array1[0] = dog1;
		
		
		array1[1] = cat1;
		
		
		array1[2] = dog2;
		
		
		array1[3] = cat2;
		
		
		try{
			//Output
			System.out.println("Serializing the Array");
			
			//create a connection stream
			FileOutputStream fileStream = new FileOutputStream("AnimalInfo.dat");
			
			//create a chain stream
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			
			//call writeObject() on the Object stream
			os.writeObject(array1);
			
			os.close();
			
		}
		//to catch an exception
		catch (Exception e) {
			e.printStackTrace();
								
		}
		
		try{
			//Output to console
			System.out.println("Deserializing the Array \n");
			
			//create inputstream object
			FileInputStream fileStream = new FileInputStream("AnimalInfo.dat");
			
			//create ojectinputstream by passing above created inputstream object
			ObjectInputStream os = new ObjectInputStream(fileStream);
			
			//call readobject method 
			array1 = (Animal[])os.readObject();
			
			//using enhanced for loop to traverse the array and print contents of deserialised array
			for(Animal p : array1){
				System.out.println(p.toString());
			}
		
			os.close();
		}
		//to catch an exception
		catch (Exception e) {
			e.printStackTrace();
		}
	
	}//End main method
}//End class
