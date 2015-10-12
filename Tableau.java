
public Class Tableau{
  
 private int tab[];
  
 public int[] getTab(){
  return this.tab;
 }
 
 public void setTab(int[] tabl){
  this.tab=tabl;
 }
 
 
 
  // fonctions de tri 

	public static void triCroissant(int tableau[]) {
		int longueur = tableau.length;
		int tmp = 0;
		boolean permut;
 
		do {
			// hypothèse : le tableau est trié
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				// Teste si 2 éléments successifs sont dans le bon ordre ou non
				if (tableau[i] > tableau[i + 1]) {
					// s'ils ne le sont pas, on échange leurs positions
					tmp = tableau[i];
					tableau[i] = tableau[i + 1];
					tableau[i + 1] = tampon;
					permut = true;
				}
			}
		} while (permut);
	}
 
	public static void triDecroissant(int tableau[]) {
		int longueur = tableau.length;
		int tmp = 0;
		boolean permut;
 
		do {
			// hypothèse : le tableau est trié
			permut = false;
			for (int i = 0; i < longueur - 1; i++) {
				// Teste si 2 éléments successifs sont dans le bon ordre ou non
				if (tableau[i] < tableau[i + 1]) {
					// s'ils ne le sont pas, on échange leurs positions
					tmp = tableau[i];
					tableau[i] = tableau[i + 1];
					tableau[i + 1] = tampon;
					permut = true;
				}
			}
		} while (permut);
	} 
}


