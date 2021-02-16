package codesDemo;

public class FindSecondHighest {

	public static void main(String[] args) {
		
		int[] arr = {10,98,6,42,12};
		int val = 0;	
		for(int i=0;i<arr.length;i++)
		{		
			for(int j=1;j<arr.length-1;j++)
			{
				if(arr[j-1] > arr[j]){               
                    val = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = val;
			}
			
		}
			System.out.println(arr[i]);

	}

	}
}

