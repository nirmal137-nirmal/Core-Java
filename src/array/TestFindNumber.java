package array;

public class TestFindNumber {
	public static void main(String[] args) {
		int [] arr = {1,20,12, 40, 30, 32, 13, 43};
		int number = 13;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			 
			if(arr[i] == number) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("Number is Not Exist");
		}else {
			System.out.println("Number is Exist");
		}
	}
}
