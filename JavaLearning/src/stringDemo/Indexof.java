package stringDemo;

public class Indexof {

	public static void main(String[] args) {
		
		//Java String indexOf() method example
		
		String s1="this is index of example";  
		//passing substring  
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  
		  
		//passing substring with from index  
		int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
		System.out.println(index3);//5 i.e. the index of another is  
		  
		//passing char value  
		int index4=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index4);//3  
		
		 
		    //Java String indexOf(String substring) Method Example
		    String s2 = "This is indexOf method";         
	        // Passing Substring    
	        int index = s2.indexOf("method"); //Returns the index of this substring  
	        System.out.println("index of substring "+index);          
	        
	        
	        //Java String indexOf(String substring, int fromIndex) Method Example
	        String s3 = "This is indexOf method";         
	        // Passing substring and index  
	        int index5 = s3.indexOf("method", 10); //Returns the index of this substring  
	        System.out.println("index of substring "+index5);  
	        index5 = s3.indexOf("method", 20); // It returns -1 if substring does not found  
	        System.out.println("index of substring "+index5);    
	        
	        //Java String indexOf(int char, int fromIndex) Method Example
	        String s4 = "This is indexOf method";         
	        // Passing char and index from  
	        int index6 = s4.indexOf('e', 12); //Returns the index of this char  
	        System.out.println("index of char "+index6);       
	    }  

	}


