import static org.junit.Assert.*;
import junit.framework.*;
import org.junit.Test;

public class TestTri extends TestCase{
	public void testQuicksort() throws Exception {
		public void TestTri{
		
			int res[]= {1,2,3,4};
			
				// tableau déja trié
			int tab[]= {1,2,3,4};	
			assertEquals(res,TriRapide.quicksort(tab,0,tab.length-1));
		
				// tableau mélangé
			int tab2[]= {4,2,1,3};	
			assertEquals(res,TriRapide.quicksort(tab2,0,tab2.length-1));
			
				// tableau inversé
			int tab3[]= {4,3,2,1};	
			assertEquals(res,TriRapide.quicksort(tab3,0,tab3.length-1));
			
				// tableau vide
			int tab4[]={};
			int res2[]={};
			assertEquals(res2,TriRapide.quicksort(tab4,0,tab4.length-1));
		}	
	}
}
