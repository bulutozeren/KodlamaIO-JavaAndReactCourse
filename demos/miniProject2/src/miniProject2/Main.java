package miniProject2;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';

		switch (harf) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kalýn sesli harf");
			break;
		case 'E':
		case 'Ý':
		case 'Ü':
		case 'Ö':
			System.out.println("Ýnce sesli harf");
			break;
		default:
			System.out.println("Lütfen sesli harf girin");
		}
	}

}
