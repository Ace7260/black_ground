package POO;

public class Departement {

	private int depatID;
	private String nom;
	private Faculte faculID;
	
	public Departement(String nom,Faculte fac,int departID){
		this.depatID=departID;
		this.nom=nom;
		faculID=fac;
	}
	
	public String identifier_Departement(){
		return faculID.identifier_Faculte()+","+nom;
	}
	
	public void modifier_Departement(String nom){
       
		this.nom=nom;
		
	}
}
