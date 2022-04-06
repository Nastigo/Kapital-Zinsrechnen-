

import Prog1Tools.IOTools;
public class Zinsrechnen {

	public static void main(String[] args) {
		int wahl;
		double t, k, p, z;
		
	// Ausgabe Men¸
		System.out.println("Eingabedaten");
		System.out.println("************");
		System.out.println("1. = Kapital");
		System.out.println("2. = Zinsfuﬂ");
		System.out.println("3. = Tage");
		System.out.println("4. = Zins");
		System.out.println("9. = Ende ");
		System.out.println("Ihre Wahl?  ");
		
		wahl = IOTools.readInteger();
		
		switch(wahl) {
		
		case 1:
			z = IOTools.readDouble("Zeit: ");
			p = IOTools.readDouble("Zinsfuﬂ: ");
			t = IOTools.readDouble("Tage:");
			k = (z*100*360)/(p*t);
			System.out.println("Kapital: " +k);
			break;
			
		case 2:
			k = IOTools.readInteger("Kapital: ");
			z = IOTools.readDouble("Zeit: ");
			t = IOTools.readDouble("Tage:");
			p = (z*100*360)/(k*t);
			System.out.println("Zinsfuﬂ: " +p);
			break;
			
		case 3:
			k = IOTools.readDouble("Kapital: ");
			z = IOTools.readDouble("Zeit: ");
			p = IOTools.readDouble("Zinsfuﬂ: ");
			t =(z*100*360)/(k*p);
			System.out.println("Tage: " +t);
			break;
			
		case 4:
			k = IOTools.readDouble("Kapital: ");
			p = IOTools.readDouble("Zinsfuﬂ: ");
			t = IOTools.readDouble("Tage:");
			z = (k*p*t)/(100*360);
			System.out.println("Zins: " +z);
			break;
			
		case 9:
			System.out.println ("Programmende");
			break;
	
		}
		

	}

}
