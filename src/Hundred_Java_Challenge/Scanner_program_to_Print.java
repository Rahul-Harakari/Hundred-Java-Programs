package Hundred_Java_Challenge;

import java.util.Scanner;

public class Scanner_program_to_Print {

	public static void main(String[] args) {
		
		m1();  //calling a method inside the Main
		
	
	}
	
	public static void m1() {
		
		int a;
		 float b;
		 String s;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter a string");
		 s = in.nextLine();
		 System.out.println("You entered string "+s);
		 System.out.println("Enter an integer");
		 a = in.nextInt();
		 System.out.println("You entered integer "+a);
		 System.out.println("Enter a float");
		 b = in.nextFloat();
		 System.out.println("You entered float "+b); 	
		
	}
	
}
