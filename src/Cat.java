/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
public class Cat extends Animal{
	
	// creating constructor
	public Cat() {
		super(); // calling the super constructor
	}
	
	//implementing sound() method
	public String sound(){
		return "meow meow";
	}
	
	//creating climb method
	public String climb(String item){
		return "is climbing a " + item;
	}
	
	//Overriding toString for Cat
	public String toString(){
		return getName() + " " + climb("tree") + " " + sound();
	}
}//End class
