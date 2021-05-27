package POO;

public class Faculte {
	
	private int faculID;	
	private String nom,code;	
	private static Faculte[] tab_Faculte;
	
	public Faculte(int fac,String nom,String cod){
		
		this.nom=nom;
		this.faculID=fac;
		this.code=cod;
		add_Faculte_Tableau(this);
	}
	
	private static void add_Faculte_Tableau(Faculte nouvel_Fac_a_ajouter){
		
		if(tab_Faculte==null)
		{
			tab_Faculte=new Faculte[1];
			tab_Faculte[0]=nouvel_Fac_a_ajouter;
		}
		else{
			
			Faculte[]temp=tab_Faculte;
			tab_Faculte=new Faculte[tab_Faculte.length+1];
			for(int i=0;i<temp.length;i++)
				tab_Faculte[i]=temp[i];
			tab_Faculte[tab_Faculte.length-1]=nouvel_Fac_a_ajouter;
			
		} 
		
	}
	
	public static void afficher_Liste_Facultes(){
       
		if(tab_Faculte!=null)
			for(int i=0;i<tab_Faculte.length;i++)
				System.out.println(tab_Faculte[i].identifier_Faculte());
		else System.out.println("Pas de données liées à la faculté à afficher");
	}
	
	public void modifier_Faculte(String nouvl_nom,String nouvel_cod){
		
		this.nom=nouvl_nom;
		this.code=nouvel_cod;
	}
	
	public String identifier_Faculte(){
		return nom+" "+code;
	}
	
	public int getFaculID() {
		return faculID;
	}
	public void setFaculID(int faculID) {
		this.faculID = faculID;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	
}
