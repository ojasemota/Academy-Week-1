package Week1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, num1 = 0, num2 = 1;
		
		
		for (int i =1; i <= a; ++i) {
			System.out.println(num1 + " ");
			int sumNum = num1 + num2;
			num1 = num2;
			num2 = sumNum;
		}
	
	}
}
