package POO;

public class Departement_Classes {

	private Departement depart;
	private Classes clas;
	private int depart_clas;
	
	/*
	 * constructeur cohabitant les deux objets independants
	 * l'un de l'autre
	 */
	public Departement_Classes(Departement dep,Classes cl,int depart_cl){
		
		this.clas=cl;
		this.depart=dep;
		this.depart_clas=depart_cl;
	}
	
	/*
	 * descrire le detail des elements des objets associés
	 */
	public String identifier_Depart_Classe(){
		return this.depart.identifier_Departement()+","+clas.identifier_Classe();
	}
	/*modifier(remplacer) l'objet de classe*/
	
	public void remplacer_Classe(Classes nouvel_cl){
	   this.clas=nouvel_cl;	
		
	}
	
/*modifier l'objet de classe*/
	
	public void remplacer_Departement(Departement nouvel_dep){
	   this.depart=nouvel_dep;	
		
	}
	
	
	public Departement getDepart() {
		return depart;
	}
	public void setDepart(Departement depart) {
		this.depart = depart;
	}
	public Classes getClas() {
		return clas;
	}
	public void setClas(Classes clas) {
		this.clas = clas;
	}
	public int getDepart_clas() {
		return depart_clas;
	}
	public void setDepart_clas(int depart_clas) {
		this.depart_clas = depart_clas;
	}
	
	
	
	
}
