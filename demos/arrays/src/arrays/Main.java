package arrays;

public class Main {

	public static void main(String[] args) {
		String student1 = "Engin";
		String student2 = "Derin";
		String student3 = "Salih";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		String[] students = new String[3];
		students[0] = "Engin";
		students[1] = "Derin";
		students[2] = "Salih";
		
		for(var student : students) {
			System.out.println(student);
		}
	}

}
