package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
	}

	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5 };
		int findNumber = 4;
		boolean result = false;

		for (int number : numbers) {
			if (number == findNumber) {
				result = true;
				break;
			}
		}

		if (result) {
			showMessage("Success");
		} else {
			showMessage("Not found.");
		}
	}

	public static void showMessage(String message) {
		System.out.println(message);
	}
}
