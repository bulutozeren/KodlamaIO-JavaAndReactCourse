package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(); //heap
		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();

		// reference type and value type
		int number1 = 10; //stack
		int number2 = 20; //stack
		number2 = number1;
		number1 = 30;
		System.out.println(number2);

		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		numbers2 = numbers1;
		numbers2 = numbers1;
		numbers1[0] = 90;
		System.out.println(numbers2[0]);
	}

}