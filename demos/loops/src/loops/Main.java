package loops;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("1'den 10'a kadar tek sayýlar");
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("For döngüsü bitti");

		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("While bitti");

		int j = 10;
		do {
			System.out.println(j);
		} while (j < 10);

		System.out.println("Do-While bitti");
	}
}
