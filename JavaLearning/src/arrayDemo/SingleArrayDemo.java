package arrayDemo;

public class SingleArrayDemo {

	public static void main(String[] args) {
		//for array size-5, 5 memory of 4 bytes will be assigned, total 20 bytes
		int student_id[] = new int[5];
		
		student_id[0] = 98;
		student_id[1] = 89;
		student_id[2] = 88;
		student_id[3] = 87;
		student_id[4] = 56;
		
		//limitation of array  - can't get value of student_id[5] - out of bound exception
		//limitation - cant add double values in int array - need to downcast- convert double(89.0) to (int) 89.0
		
		System.out.println("Student id is "+student_id[2]);
	}

}
