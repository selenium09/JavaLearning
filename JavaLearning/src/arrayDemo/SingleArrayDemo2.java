package arrayDemo;

public class SingleArrayDemo2 {

	public static void main(String[] args) {
		//for array size-5, 5 memory of 4 bytes will be assigned, total 20 bytes
		
		String student_names[] = new String[5];
		
		student_names[0] = "Sumit";
		student_names[1] = "Sunil";
		student_names[2] = "Mugdha";
		student_names[3] = "Sapna";
		student_names[4] = "Sourav";
		
		
		int student_id[] = new int[5];
		
		student_id[0] = 98;
		student_id[1] = 89;
		student_id[2] = 88;
		student_id[3] = 87;
		student_id[4] = 56;
		
		int sizeofarray = student_id.length;
		
		for(int i=0;i<sizeofarray;i++)					//for loop
		{
			System.out.println("Student id for roll "+i+" is "+student_id[i]);	
		}
		
		System.out.println("while loop results");		//while loop
		int count = 0;
		while(count<sizeofarray)
		{
			System.out.println("Student id for roll "+count+" is "+student_id[count]);
			count++;
		}
		
		//printing names
		
		System.out.println("Printing names with IDs");
		
		int sizeofnamearray = student_names.length;
		for(int i=0;i<sizeofnamearray;i++)
		{
			System.out.println("Student name for roll "+student_id[i]+" is "+student_names[i]);
		}
		
				
	}

}
