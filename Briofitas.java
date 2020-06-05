package classes;
import classes.Plantae;

public class Briofitas extends Plantae{
    
	public Briofitas(String no, int ta, String cl, String es){
 super(no,ta,cl,es);
	} 

 
 public void soltarEsporos() {
		System.out.println("\n"+this.getNome()+" está soltando esporos!");
	}
	
	@Override
	public void corpoPlantae(){
		System.out.println("\nDefinição:\nCorpo do(a) "+this.getNome()
		+": possui cauloide, rizoides e filoides.\n");
	}
	
		@Override
	public String toString() {
		return "=======================================================================\n" +
		"\n"+this.getNome() +" é da divisão das Briófitas!\n" +
				"\nPlantinha Info\n" + "Nome: " + this.getNome() + "\nTamanho: " + this.getTamanho() + "cm"
		 +"\nClasse: " + this.getClasse() + "\nEspecie: " + this.getEspecie() + "\n"+
				"\n=======================================================================\n";
	}
}
