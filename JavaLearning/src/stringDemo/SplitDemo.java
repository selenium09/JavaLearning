package stringDemo;

public class SplitDemo {

	public static void main(String[] args) {
		String fullname = "Selenium-HP-QTP-Grid";
		String []toolname = fullname.split("-");       //toolname is name of variable - split will return array of string
		
		for(int i=0;i<toolname.length;i++)
		{
			System.out.println("value for "+i+" is " +toolname[i]);	//printing array
			
			if(toolname[i].equalsIgnoreCase("QTP"))
			{
				System.out.println("Test passed");
				break;								//stops the loop after keyword is found
			}
		}
		
		String name = "      Sumit    Selenium      ";
		
		String name1 = name.trim();    //trims spaces before and after the string
		System.out.println(name1);
		
		String name2 = "Sumit Selenium";
		System.out.println(name2.charAt(4));		//return char at specified index
				
		
	}

}
