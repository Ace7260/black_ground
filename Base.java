package ult;

public class Base {
	
    public  int[] saisi_Dynamique_Tab(){
    	
    	int tab[]=new int[Bases.Base.saisieEntier("Tapez la taille du tableau")];
    	
    	for(int i=0;i<tab.length;i++)
    		tab[i]=Bases.Base.saisieEntier("Tapez l'entier du tableau à l'index("+i+")");
      return tab;
    }
	public void order_by_desc(int [] tab)
	{
		int temp,i=0,j=i;
		if(tab!=null)
			for(;i<tab.length;i++){
			
				for(j=i+1;j<tab.length;j++){
					if(tab[i]>tab[j])
					{
						temp=tab[j];
						tab[j]=tab[i];
						tab[i]=temp;						
					}
				}
				
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Base el=new Base();
	   
	   int [] t=el.saisi_Dynamique_Tab();
	   
	   el.order_by_desc(t);
     System.out.println("Tableau ordonné");
	   for(int j=0;j<t.length;j++){
		  System.out.print(" "+t[j]);   
	   }
   
   
	}

}
