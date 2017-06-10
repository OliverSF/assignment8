
/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
import java.io.Serializable;

//creating abstract class Animal that implements serializable
public abstract class Animal implements Serializable {

	// creating private String variable
	private String name;

	// constructor
	public Animal() {
		name = "";
	}

	// mutator
	public void setName(String animalName) {
		name = animalName;
	}

	// accessor
	public String getName() {
		return name;
	}

	// Overriding toString Method
	public String toString() {
		return "";
	}

	// implement in subclass
	public abstract String sound();
}// End class
