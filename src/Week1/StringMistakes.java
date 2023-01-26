package Week1;

public class StringMistakes {

	public static void main(String[] args) {
			
		 String goal = "madam";
			
			int first = 0;
			int last = goal.length() - 1;
			
			boolean isPalindrome = true;
			
			while(first < last) {
				
				if(goal.charAt(first) != goal.charAt(last)) {
				isPalindrome = false;
				break;			
			}
				first++;
				last--;
			}
			
			    if(isPalindrome) {
			    	System.out.println("Palindrome");
			    }
			    else {
			    	System.out.println("Is not a Palindrome");
			    }
	            
		

		}

	}

//create program to determine if an input is a pa 