package miniProject1;

public class Main {

	public static void main(String[] args) {
		int number = 1;

		int remainder = number % 2;

		System.out.println(remainder);

		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Say� asal de�ildir.");
			return;
		}
		if (number < 1) {
			System.out.println("Ge�ersiz say�");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("Asal say�d�r.");
		} else {
			System.out.println("Asal say� de�ildir.");
		}
	}

}
