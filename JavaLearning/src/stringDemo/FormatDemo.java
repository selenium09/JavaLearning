package stringDemo;

public class FormatDemo {

	public static void main(String[] args) {
		
		//The java string format() method returns the formatted string by given locale, format and arguments.
		
		String str1 = String.format("%d", 101);          // Integer value  
        String str2 = String.format("%s", "Amar Singh"); // String value  
        String str3 = String.format("%f", 101.00);       // Float value  
        String str4 = String.format("%x", 101);          // Hexadecimal value  
        String str5 = String.format("%c", 'c');          // Char value  
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        System.out.println(str5);  
        
        
        //Apart from formatting, we can set width, padding etc. of any value. Let us see an example where we are setting width and padding for an integer value.
        
        String str6 = String.format("%d", 101);  
        String str7 = String.format("|%10d|", 101);  // Specifying length of integer  
        String str8 = String.format("|%-10d|", 101); // Left-justifying within the specified width  
        String str9 = String.format("|% d|", 101);   
        String str10 = String.format("|%010d|", 101); // Filling with zeroes  
        System.out.println(str6);  
        System.out.println(str7);  
        System.out.println(str8);  
        System.out.println(str9);  
        System.out.println(str10);  

	}

}
