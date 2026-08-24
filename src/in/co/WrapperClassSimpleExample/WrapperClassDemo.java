package in.co.WrapperClassSimpleExample;

public class WrapperClassDemo {
	
	public static void main(String[] args) {
		
		int j = 5;
		
		Integer jobj = new Integer(j); // old Way to AutoBoxing
		
		int k = jobj;  // old way to unBoxing
		
		System.out.println("-----------------------------");
		
		int i = 5;
		
		Integer iobj = i ;  // New Way to AutoBoxing ;
		
		i = iobj;  // New Way to UnBoxing;
		
	}

}
