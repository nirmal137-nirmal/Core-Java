package array;

public class TestStringArray {
	public static void main(String[] args) {
		
		String[] str = { "Nirmal", "Abhishek", "Nayan", "Rupesh"};
		
		for(int i =0 ; i< str.length; i++) {
			System.out.println(i +" = "+ str[i]);
		}
		System.out.println("------------------");
		
		for(String i : str) {
			System.out.println(i);
			
		} 
	}
}
