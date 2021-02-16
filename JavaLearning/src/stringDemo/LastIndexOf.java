package stringDemo;

public class LastIndexOf {

	public static void main(String[] args) {
		
		//it starts position from last side, means in case of 5, it will start from 5th position in reverse directions 
		
		String s1="this is index of example";//there are 2 's' characters in this sentence  
		int index1=s1.lastIndexOf('s');//returns last index of 's' char value  
		System.out.println(index1);//6  

		
		 String str = "This is index of example";  
	        int index = str.lastIndexOf('s',5);  
	        System.out.println(index);
	        
	        
	        String str1 = "This is last index of example";  
	        int index2 = str1.lastIndexOf("of");  
	        System.out.println(index2);   
	        
	        
	        String str2 = "This is last index of example";  
	        int index3 = str2.lastIndexOf("of", 25);  
	        System.out.println(index3);  
	        index3 = str2.lastIndexOf("of", 10);  
	        System.out.println(index3); // -1, if not found        
	}

}
