package Week1;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
		  int n, a = 1, b = 1;
	      
	      System.out.print("input = ");
	      n = scan.nextInt();
	      
	      for(int i = 1; i <= n; i++)
	      {
	    	  int c = a + b;
	    	  a = b;
	          b = c;
	          
	          System.out.println(a+" ");
	      }
	      
	      scan.close();

	}	

}
