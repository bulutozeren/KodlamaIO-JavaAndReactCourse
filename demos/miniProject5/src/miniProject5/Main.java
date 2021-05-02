package miniProject5;

public class Main {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 5, 7, 9, 0 };
		int find = 5;
		boolean result = false;
		
		for (int number : numbers) {
			if (number == find) {
				result = true;
				break;
			}
		}
		
		if (result) {
			System.out.println("Sayı var");
		}else {
			System.out.println("Sayı yok");
		}
	}

}
