/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
public class Dog extends Animal{
	
	// creating constructor
	public Dog() {
		super(); // calling the super constructor
	}
	
	//implementing sound() method
	public String sound(){
		return "woof woof";
	}
	
	//creating fetch method
	public String fetch(String item){
		return "is chasing a " + item;
	}
	
	//overriding toString for Dog
	public String toString(){
		return getName() + " " + fetch("stick") + " " + sound();
	}
}//End class
