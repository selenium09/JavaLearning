package stringDemo;

public class SubStringDemo {

	public static void main(String[] args) {
		
      //The java string substring() method returns a part of the string.

     //We pass begin index and end index number position in the java substring method where start index is inclusive and end index is exclusive.
     //In other words, start index starts from 0 whereas end index starts from 1.
		
		//startIndex : starting index is inclusive

        //endIndex : ending index is exclusive
		
		String s1 = "javaTpoint";
		System.out.println(s1.substring(2, 4)); //returns va - 2 inclusive, 4 exclusive so it gives postions 2&3
		System.out.println(s1.substring(2)); //returns vatpoint
		
		
		
		String s2="Javatpoint";    
        String substr = s2.substring(0); // Starts with 0 and goes to end  
        System.out.println(substr);  
        String substr2 = s2.substring(5,10); // Starts from 5 and goes to 10  
        System.out.println(substr2);    
        String substr3 = s2.substring(5,15); // Returns Exception  
        System.out.println(substr3); 
        
	}

}
