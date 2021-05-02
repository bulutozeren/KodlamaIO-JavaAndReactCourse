package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel";
		String newMessage = message.substring(0, 5);
		System.out.println(newMessage);
		
		int result = sub(12,8);
		System.out.println(result);
		
		System.out.println(mul(5,6,4,1));
	}

	public static void add() {
		System.out.println("Eklendi");
	}

	public static void update() {
		System.out.println("Güncellendi");
	}

	public static void delete() {
		System.out.println("Silindi");
	}

	public static int sub(int number1, int number2) {
		return number1 - number2;
	}
	
	public static int mul(int... numbers) {
		var result = 1;
		for (int number : numbers) {
			result *= number;
		}
		return result;
	}

	public static String getCity() {
		return "İzmir";
	}
}
