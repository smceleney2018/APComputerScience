/*
 * Mini Project 1
 * Sinead McEleney
 * This project prints "victory is mine" in a box
 */

public class MP1 {

	public static void main(String[] args) {
		//calls the methods to print the box
		line();
		middle();
		line();

	}
	
	//prints a line of slashes
	public static void line(){
		System.out.println("//////////////////////");
	}
	
	
	//prints the middle line
	public static void middle(){
		System.out.println("|| Victory is mine! ||");
	}

}

