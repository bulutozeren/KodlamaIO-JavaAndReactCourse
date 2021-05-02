package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String message = "Bugün hava çok güzel.";

		System.out.println(message);

		System.out.println("Karakter sayýsý: " + message.length());

		System.out.println("5. eleman: " + message.charAt(4));

		System.out.println(message.concat(" Yaþasýn!"));
		System.out.println(message);

		System.out.println(message.startsWith("B"));
		System.out.println(message.startsWith("A"));

		System.out.println(message.startsWith("c"));
		System.out.println(message.startsWith("."));

		char[] chars = new char[5];
		message.getChars(0, 5, chars, 0);
		System.out.println(chars);

		System.out.println(message.indexOf('a'));
		System.out.println(message.indexOf("va"));

		System.out.println(message.lastIndexOf('e'));
		System.out.println(message.lastIndexOf("ze"));

		var newMessage = message.replace(' ', '-');
		System.out.println(newMessage);

		System.out.println(message.substring(6));

		for (String word : message.split(" ")) {
			System.out.println(word);
		}

		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());

		System.out.println(message.trim());
	}

}
