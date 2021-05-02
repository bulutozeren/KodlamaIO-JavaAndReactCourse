package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 210;
		int number2 = 25;
		int number3 = 28;
		
		int temp = number1;
		
		if (temp < number2) {
			temp = number2;
		}

		if (temp < number3) {
			temp = number3;
		}
		
		System.out.println("En büyük sayı: " + temp);
	}

}
