package POO;

public class Classes {
	
	private String nom;
	private int classeID;
	/*
	 * ce constructeur va creer un objet de la classe Classe et l'initialise
	 */
	public Classes(String nom,int cl){
		this.nom=nom;
		this.classeID=cl;
	}
	/*
	 * la suivante fonction va retourner 
	 * le nom de la classe de l'objet courant 
	 */
	public String identifier_Classe(){
		return this.nom;
		
	}
	
	public void modifier_Classe(String nouvel_nom){
	   this.nom=nouvel_nom;
	   }
	public int getClasseID() {
		return classeID;
	}
	public void setClasseID(int classeID) {
		this.classeID = classeID;
	}

	
}
