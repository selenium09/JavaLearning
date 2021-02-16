package codesDemo;

public class Codes extends Codes1 {
	
	public static void sendmessage()
	{
		System.out.println("I am in codes class");
	}

	
	public static void main(String[] args) 
	{
		
	//Codes1 code = new Codes1();					//why static is required here to call the regex email method.
	Codes1.Regexp("abc@abc.comfjsfjsfkj23142134");
	Codes1.Regexp_Email("abcdgfdgdg@abcdesd.comfjsfjsfkj23142134");

	
	
	String str;
	int i;
	String a = "", b = "";
	 str = "sumit rajhans";	
	 String[] arr = str.split(" ");
	 //System.out.println(arr[0]);
	 //System.out.println(arr[1]);
	 
	 for(i=0;i<arr.length;i++)
	 {
		 //System.out.println(arr[i]);
		 char[] strarr = arr[i].toCharArray();
		 
		 for(int j=strarr.length-1;j>=0;j--)
		 {
			
			 a = a+strarr[j];		 
		 }
		 b = b+a+"  ";
		 a="";
	 }
	
	 System.out.println(b);
	
	 //optimal way
	 
	 String reverseString = "";
	 String inputString = "sumit rajhans";	
	 String[] words = inputString.split(" ");
	
	 for(int k=0;k<words.length;k++)
	 {
		 String word = words[k];
		 String reverseWord = "";
		 
		 for(int j=word.length()-1;j>=0;j--)
		 {
			 reverseWord = reverseWord+word.charAt(j);			//charAt returns the letter certain index
				 
		 }
		 
		 reverseString = reverseString+reverseWord+" ";
	 }
	
	 System.out.print(reverseString);

	}
	
	
	
}
