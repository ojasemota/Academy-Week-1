package Week1;

public class Bags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,3,5,6,};
		int low = 0;
		int high = nums.length -1 ;
		int target = 5;
		while (low <= high) {
			int mid = low  + (high-low);
			if(nums[mid]== target) 
				System.out.print(mid);
			if (target<nums[mid]) {
				high = mid-1;
			}
			else {
				low = mid + 1;
			}
 		}
		System.out.print(low);

	}

}
