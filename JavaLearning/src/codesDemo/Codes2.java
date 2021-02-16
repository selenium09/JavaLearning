package codesDemo;

public class Codes2 {

 static int count;

	public static void main(String[] args) {
		
		/*String str = "This this is is done by Suraj Suraj";
				//"ThisthisisisdonebySurajSuraj"

				String strr = str.replace(" ","").toLowerCase();
				char[] arr = strr.toCharArray();
				 for(int i=0;i<arr.length;i++)
				{
					 count=1;
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i]==(arr[j]))
						{
							count++;
					
						}
					
					}
					System.out.println(arr[i]+" count is "+count);

				}*/
		
		int mul=1;

		for(int i=5;i>=1;i--)
		{
			mul = i*mul;
			
		}
		
		System.out.println(mul);
	}


}
