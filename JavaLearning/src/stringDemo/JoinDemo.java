package stringDemo;

public class JoinDemo {

	public static void main(String[] args) {
		
		String joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);  
		
		//We can use delimeter to format the string as we did in the below example to show date and time.
		 String date = String.join("/","25","06","2018");    
	        System.out.print(date);    
	        String time = String.join(":", "12","10","10");  
	        System.out.println(" "+time);  

	}

}
