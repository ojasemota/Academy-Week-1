package Week1;

import java.util.Scanner;

public class ASCIIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner (System.in);
	        int n, a = 0, b = 1, c = 2;
		    System.out.print("Enter a number - ");
		    n = scan.nextInt();
		    System.out.println("");
		    for(int i = 1; i <= n; i++)
		    {
		        a = b;
		        b = c;
		        c = a + b;
		        System.out.println(a+" ");
		    }

	          scan.close();
	    
		
	
	}

}
