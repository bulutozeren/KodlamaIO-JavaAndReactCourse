package miniProject2;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';

		switch (harf) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kal�n sesli harf");
			break;
		case 'E':
		case '�':
		case '�':
		case '�':
			System.out.println("�nce sesli harf");
			break;
		default:
			System.out.println("L�tfen sesli harf girin");
		}
	}

}
