package Week1;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter number:");
		
		int data1 = input.nextInt();
		
		if (data1 > 0) {
		  System.out.println("Positive");
		}
		else{
		  System.out.println("Negative");
		}
	
		
				
		
		input.close();
	
	
		
		
  
	}

}
