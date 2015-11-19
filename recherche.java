
public class Recherche {

	public static boolean rechercheDicho(int t[], int elemt)
	{
		int gauche=0;
		int droite=t.length;
		int milieu;
		int j=0;
		boolean res=false;
		
		for(int i=0; i<t.length;i++)
		{
			milieu=(gauche+droite)/2;
			
			if(t[milieu]==elemt)
			{
				res=true;
			}
			else if(t[milieu] < elemt)
			{
				gauche  = milieu;
			}
			else
			{
				droite = milieu;
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t[]={1,2,3,4,5,8,9};
		System.out.println(rechercheDicho(t,1));
	}

}
