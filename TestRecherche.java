import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.*;

public class TestRecherche extends TestCase{

	public void testHorsTableau()
	{
		int tab[]={1,2,4,5};
		int element=6;
		//Un élément hors du tableau
		assertEquals(false,Recherche.rechercheDicho(tab,element));
	}

	public void testDansTableau()
	{
		int tab[]={1,2,4,5};
		int element1 = 4;
		int element2 = 1;
		int element3 = 5;
		//Un élément dans le tableau
		assertEquals(true,Recherche.rechercheDicho(tab,element1));
		//Premier élément du tableau
		assertEquals(true,Recherche.rechercheDicho(tab,element2));
		//Dernier élément du tableau
		assertEquals(true,Recherche.rechercheDicho(tab,element3));
		
		int tab2[];
		int element4 = 2;
		//Recherche dans un tableau vide
		assertEquals(false,Recherche.rechercheDicho(tab,element4));

		int tab3[] = {1,2,2,4};
		int element5 = 2;
		//recherche d'un élément présent plusieurs fois dans le tableau
		assertEquals(true,Recherche.rechercheDicho(tab,element5));
	}
}
