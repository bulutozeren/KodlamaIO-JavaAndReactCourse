package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world.");
		
		String internetSubeButtonu = "Ýnternet Þubesi";
		System.out.println(internetSubeButtonu);

		double dunDolarDegeri = 8.15; 
		double bugunDolarDegeri = 8.18; 
		
		int vade = 36;
		
		boolean dolarDustuMu = false;
		
		if (bugunDolarDegeri<dunDolarDegeri) {
			System.out.println("Dolar düþtü");
			dolarDustuMu = false;
		}else if (bugunDolarDegeri == dunDolarDegeri) {
			System.out.println("Dolar eþit");
		}
		else {
			System.out.println("Dolar yükseldi");
			dolarDustuMu = true;
		}

		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Emekli kredisi";
		String kredi3 = "Konut kredi";
		String kredi4 = "Çiftçi kredi";
		String kredi5 = "Taþýt kredi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		String[] krediler = {
				"Hýzlý kredi",
				"Emekli kredisi",
				"Konut kredi",
				"Çiftçi kredi",
				"Taþýt kredi"
		};
		
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		
		System.out.println(sehir1);
	}

}
