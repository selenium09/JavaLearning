package stringDemo;

public class CompareToDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "Hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		String s6 = "hello";
		String s7 = "";
		String s8 = "me";
		
		System.out.println(s1.compareTo(s6));		//0 because both are equal
		System.out.println(s1.compareTo(s2));		//32 because it is uppercase and difference of 32 char
		System.out.println(s1.compareTo(s3));		//-5 because h is 5 times lower than m
		System.out.println(s1.compareTo(s4));		//-1 because l is 1 lower than m
		System.out.println(s1.compareTo(s5));		//2 because h is 2 greater than f
		
		
		//If you compare string with blank or empty string, it returns length of the string. 
		
		System.out.println(s1.compareTo(s7));       //If second string is empty, result would be positive.
		System.out.println(s7.compareTo(s8));       // If first string is empty, result would be negative.
		
		//concatenation
		
		String str = s1.concat(" ").concat(s3).concat("!!").concat(s5).concat("@").concat(s8);
		System.out.println(str);
		
		
	}

}
