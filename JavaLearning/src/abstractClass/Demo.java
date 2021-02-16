package abstractClass;

import java.util.Arrays;

public class Demo {
	static int temp = 0;

public static void main(String[] args) 
{ 
/*	int arr[] = {200,50,5,1,20,100,6,24,51,3,1,521,63,78,96,25,46,99,4};
	
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length-1;j++)
		{
			if(arr[i]>arr[j])
			{
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}			
		}
		System.out.println(arr[i]);
*/	
/*	for(int i =0; true ; i++)
	{
	     System.out.println("Hi");
	    //break;
	}
	
	System.out.println("Bye");*/
	
		int a[] = {0, 5, 5, 5, 4};
		int n = 0;
		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);
		
		
		for(int k=0;k<a.length;k++)
		{	
			
			if(visited[k] == true)
			
			continue;
			
			int count=1;
			for(int l=k+1;l<a.length;l++)
			{
				if(a[k]==a[l])
				{
					visited[l]=true;
					count++;
				}
					
				
			}
			System.out.println(a[k]+" occurs"+count+" times");
			
			}
			
		}
}

		
		
		//----------------- additional technical questions
		/*public class demo {
			public static void main(String[] args) 
			{ 
			if(true) 
			break; 
			} 
			}
			compile-
			run -
			output -
			---------------------
			public class A { 
			public static void main(String[] args) 
			{ 
			System.out.println('j' + 'a' + 'v' + 'a'); 
			} 
			}
			compile-
			run -
			output -
			------------
			Array - {1,5,8,9,50,100,200}
			Output - Largest number is 200
			Smallest number is 1
			-----------------------------

			Find the frequency of a number in an array
			Input : a[] = {0, 5, 5, 5, 4}
			x = 5
			Output : 3
			------------

			for(int i =0; true; i++)
			{
			     System.out.println("Hi");
			}
			System.out.println("Bye");*/















		
		
		





	


