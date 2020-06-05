package classes;
import java.lang.Math;

 abstract class Plantae {
	
	protected String nome;
	protected String classe;
	protected String especie;
	protected int tamanho;
	
	public Plantae(String no, int ta, String cl, String es) {
		this.nome = no;
		this.tamanho = ta;
		this.classe = cl;
		this.especie = es;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		this.nome= no;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String es) {
		this.especie= es;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String cl) {
		this.classe= cl;
	}
	public int getTamanho() {
		return tamanho;
	}
 
 //Overload
  public void setTamanho(int ta){
  this.tamanho = ta;
 }
  public void setTamanho(double ta){
  int aux = (int)Math.round(ta);
  this.tamanho = aux;
	}
	//End
 
	public void tomarSol() {
		System.out.println("\n" + this.getNome() + " está fazendo fotossíntese agora!");
	}
	
	public void corpoPlantae(){
		System.out.println("Definição corpo Plantae");
	}

	@Override
	public String toString() {
		return "=======================================================================\n" +
				"\nPlantinha Info\n" + "Nome: " + this.getNome() + "\nTamanho: " + this.getTamanho() + "cm"
		 +"\nClasse: " + this.getClasse() + "\nEspecie: " + this.getEspecie() + "\n" +
				"\n=======================================================================\n";
	}
	

}

