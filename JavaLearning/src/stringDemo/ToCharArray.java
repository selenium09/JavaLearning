package stringDemo;

public class ToCharArray {

	public static void main(String[] args) {
		
		//The java string toCharArray() method converts this string into character array. 
		//It returns a newly created character array, its length is similar to this string and its contents are initialized with the characters of this string.
		String s1 = "Welcome to Javatpoint";
		char[] ch = s1.toCharArray();
		int len = ch.length;
		System.out.println("Char array length: "+len);
		System.out.println("Char Array elements are: ");
		for(int i=0;i<len;i++)
		{
			System.out.println(ch[i]);
		}

	}

}
