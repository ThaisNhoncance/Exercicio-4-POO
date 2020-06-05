package classes;

public class Botanica {
   

	public static void main(String[] args) {
	
	System.out.println("______ _             _   _       _             _____ _                \r\n" + 
			"| ___ \\ |           | | (_)     | |           |_   _(_)               \r\n" + 
			"| |_/ / | __ _ _ __ | |_ _ _ __ | |__   __ _    | |  _ _ __ ___   ___ \r\n" + 
			"|  __/| |/ _` | '_ \\| __| | '_ \\| '_ \\ / _` |   | | | | '_ ` _ \\ / _ \\\r\n" + 
			"| |   | | (_| | | | | |_| | | | | | | | (_| |   | | | | | | | | |  __/\r\n" + 
			"\\_|   |_|\\__,_|_| |_|\\__|_|_| |_|_| |_|\\__,_|   \\_/ |_|_| |_| |_|\\___|\r\n" + 
			"                                                                     ");
		
	
	
	Briofitas b1 = new Briofitas("Musgo", 2, "Bryopsida", "Bryophyta sensu stricto");
 System.out.print(b1.toString());
	Pteridofitas p1 = new Pteridofitas ("Cabelo-de-Vênus", 40, "Pteridopsia", "A. capillus-veneris");
	System.out.println(p1.toString());
	
		
	b1.setTamanho(2.7);
	System.out.println(b1.getNome()+" Cresceu!!");
	System.out.print(b1.toString());
		
 b1.tomarSol();
	b1.soltarEsporos();
	b1.corpoPlantae();
	p1.tomarSol();
	p1.corpoPlantae();
	
	
	}
}
