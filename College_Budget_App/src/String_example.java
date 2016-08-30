import java.util.Scanner;


public class String_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "Oop, Hello there. My name is C-3P0, human cyborg relations. And who might you be?";
		
		String name = "Dan";
		
		System.out.println(greeting);
		System.out.println("My name is "+ name);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		System.out.println(greeting);
		String myName = in.nextLine();
		System.out.println();
		System.out.println("Hello, " + myName + ", it is nice to meet you.");
		
		
		
	}

}
