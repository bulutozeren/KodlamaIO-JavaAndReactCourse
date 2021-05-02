package methodOverloading;

public class Calculation {
	public int add(int number1, int number2) {
		return number1 + number2;
	}

	public int add(int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}

	public int add(int... numbers) {
		int result = 0;
		for (int number : numbers) {
			result += number;
		}
		return result;
	}
}
