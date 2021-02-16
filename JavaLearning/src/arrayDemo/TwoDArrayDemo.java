package arrayDemo;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		//for array size-5, 5 memory of 4 bytes will be assigned, total 20 bytes
		
		int school[][] = new int[2][2];
		school[0][0] = 12;
		school[0][1] = 24;
		school[1][0] = 36;
		school[1][1] = 48;
		
		System.out.println("school number is "+school[1][1]);
		
		for(int i=0;i<school.length;i++)
		{
			for(int j=0;j<school.length;j++)
			{
				System.out.println("School number for "+"["+i+"]"+"["+j+"]"+" is "+school[i][j]);
			}
		}
		
		System.out.println("School length is "+school.length);
		System.out.println("While loop results");
							//look out for while solution, its not able to print all four arrays
		int count = 0;
		int count1 = 0;
		while(count<school.length)
		{
			while(count1<=school.length)
			{
				System.out.println("School number for "+"["+count+"]"+"["+count1+"]"+" is "+school[count][count1]);
				count1++;
				
			}
			
			count++;
			
		}
	
		}
		
				
	}


