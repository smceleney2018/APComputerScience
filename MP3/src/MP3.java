
public class MP3 {

	public static void main(String[] args) {
		//prints the output
		line();
		box();
		box();
		box();
		box();
		box();
	}
	
	//prints a middle than a line
	public static void box(){
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
