package Week1;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber = 143;
		int reversedValue = 0;
		int remainderValue = 0;


		      while (inputNumber > 0){
			            
			    	    reversedValue=reversedValue*10+inputNumber%10;
			    	    inputNumber = inputNumber/10;
			    	    }
		      System.out.println(reversedValue);
		      
		      
		   	      
		      

	}

}
