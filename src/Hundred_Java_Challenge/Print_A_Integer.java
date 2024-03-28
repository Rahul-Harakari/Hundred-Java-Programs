package Hundred_Java_Challenge;

public class Print_A_Integer {

	public static void main(String[] args) {
		
		int c;
		
		for (c=1; c<=10; c++) {
			System.out.println(c);
		}
		
		
		System.out.println("**********Printing the integer from Method ********");
		Print_A_Integer obj=new Print_A_Integer();
		obj.approach2();

	}

	public void approach2() {
		
		for(int a=1; a<=10; a++) {
			System.out.println(a);
		}
		
		
	}
	
	
	
}
