package Test_POO;
import Bases.Base;
import POO.*;
public class TestPOO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		do{
			Menu();
		}while(true);
	}
	
	static void Menu(){
		
		System.out.println("1. Cr�er une nouvelle Facult�");
		System.out.println("2.Afficher les facult�s d�j� enregistr�es");
		System.out.println("3.Quitter");
		
		switch(Base.saisieEntier("Choississez l'un des choix ci haut!!")){
		
		case 1:
			   new Faculte(Base.saisieEntier("Tapez l'id de la facult�"),Base.saisie_Chaine_Caracteres("Tapez le nom de la facult�"),Base.saisie_Chaine_Caracteres("Tapez le code de la facult�"));
			break;
			
		case 2:
			  Faculte.afficher_Liste_Facultes();
			break;
		case 3:System.exit(0);
			break;
		default:
				
		}
	}

}
