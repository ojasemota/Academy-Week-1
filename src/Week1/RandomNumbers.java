package Week1;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 50;
		int max = 100;
		
		System.out.println("Random value in int from " + max + ":");
		
		int num = (int)Math.floor(Math.random() *(max - min + 1) + min);
		
		System.out.println(num);

	}

}
