package demo;

/***
* A simple program using for loop
*/

public class HelloWorld {

	public static void main(String[] args) {
		String s = "Hello";
		String t = "World";
		System.out.println(s+" "+t+"!");
		
		for (int i = 1; i<=10; i++){
			System.out.println("Line-"+i);
		}
		System.out.println("One more sample line");
		System.out.println("***End***");

	}

}
