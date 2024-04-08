package Hundred_Java_Challenge;

import java.util.Scanner;

public class Convert_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		float TempDegree;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Temp in Fahrenheit");
		TempDegree = in.nextFloat();
		
		TempDegree = ((TempDegree - 32)*5)/9;
		
		System.out.println("Temperature in Degree" +TempDegree);
		
		

	}

}
