package string;

public class TestString {
	public static void main(String[] args) {
		
		String s = "Nirmal Fayake";
		
		//Print String 
		System.out.println(s);
		    
		//Print String Length
	    System.out.println("String length: " + s.length());
	    
	    //Print String Specific Character
	    System.out.println("5th Character: " + s.charAt(5));
	    
	    //Index of Specific Character
	    System.out.println("Index of rma: " + s.indexOf("rma"));
	    
	    //Print Specific Number Position
	    System.out.println("Position of i : " + s.indexOf("i"));
	    
	    //Print Last Character Number 
	    System.out.println("Last Position of i : " + s.lastIndexOf("F")); // ?
	    
	   // Replace Character
	    System.out.println(" i is replaced by a : " + s.replace("i", "a"));
	    
	   // Print All In Lower Case
	    System.out.println("Lower Name :" + s.toLowerCase());
	    
	    //Print All In Upper Case
	    System.out.println("Upper Name :" + s.toUpperCase());
	    
	    //Start with Fayake
	    System.out.println("Start with Fayake : " + s.startsWith("Fayake")); // Fayake se Start ho rha hai ya nhi True false retunr Karega 
	    
	    //surname p 
	    System.out.println("Surname Name : " + s.substring(6, 10)); // 6th or 10th ke bich ke character print karega
	    
	    
  
		}
		
	}
