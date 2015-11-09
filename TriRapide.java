import java.*;


public class TriRapide{
	public static void quicksort(int [] tableau, int debut, int fin) {
		if (debut < fin) {
		    int indicePivot = partition(tableau, debut, fin);
		    quicksort(tableau, debut, indicePivot-1);
		    quicksort(tableau, indicePivot+1, fin);
		}
	}

	public static int partition (int [] t, int debut, int fin) {
		int valeurPivot = t[debut];
		int d = debut+1;
		int f = fin;
		while (d < f) {
		    while(d < f && t[f] >= valeurPivot) f--;
		    while(d < f && t[d] <= valeurPivot) d++;
		    int temp = t[d];
		    t[d]= t[f];
		    t[f] = temp;
		}
		if (t[d] > valeurPivot) d--;
		t[debut] = t[d];
		t[d] = valeurPivot;
		return d;
	}

	public static void main(String[] args){
		int tab[]={2,152};
		quicksort(tab, 0 ,tab.length-1);
		
		if(tab.length == 0){
			System.out.println("Tableau vide");
		}
		
		else {
		
			int i;
			for (i=0 ; i < tab.length ; i++){
				System.out.print(" "+tab[i]); 
			}
		
		}
	}
	
	
}
